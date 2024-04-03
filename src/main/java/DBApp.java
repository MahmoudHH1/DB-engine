import Data.Handler.FileCreator;
import Data.Handler.Pair;
import Data.Index.BPlusIndex;
import Data.Index.IndexControler;
import Data.Index.Operations;
import Data.Index.Pointer;
import Data.Page.Page;
import Data.Page.Record;
import Data.Table.MetaData;
import Data.Table.Table;
import Data.Table.TableColumn;
import Data.Validator.TupleValidator;
import Exceptions.DBAppException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



public class DBApp {
    public ArrayList<Table> allTables;
    public static ArrayList<BPlusIndex> allBPlusIndecies = new ArrayList<>();


    public DBApp() throws IOException, ClassNotFoundException {
        init();
    }

    // this does whatever initialization you would like
    // or leave it empty if there is no code you want to
    // execute at application startup
    public void init() throws IOException, ClassNotFoundException {
        allTables = MetaData.loadAllTables();
        MetaData.loadPageSize();
    }

    // following method creates one table only
    // strClusteringKeyColumn is the name of the column that will be the primary
    // key and the clustering column as well. The data type of that column will
    // be passed in htblColNameType
    // htblColNameValue will have the column name as key and the data
    // type as value
    public void createTable(String strTableName,
                            String strClusteringKeyColumn,
                            Hashtable<String, String> htblColNameType) throws DBAppException, IOException {
        Table t = Table.getTable(allTables, strTableName);
        if (t != null) {
            throw new DBAppException("Table is already exist");
        }
        ArrayList<TableColumn> allColumns = new ArrayList<>();
        for (String column : htblColNameType.keySet()) {
            TableColumn newColumn = new TableColumn(
                    strTableName,
                    column,
                    htblColNameType.get(column),
                    column.equals(strClusteringKeyColumn)
            );
            allColumns.add(newColumn);
        }
        Table table = new Table(allColumns);
        allTables.add(table);
    }

    // following method creates a B+tree index
    public void createIndex(String strTableName,
                            String strColName,
                            String strIndexName) throws DBAppException, IOException {
        try {
            Table table = Table.getTable(allTables, strTableName);
            for (TableColumn col : table.getAllColumns()) {
                if (col.getColumnName().equals(strColName)) {
                    col.setIndexName(strIndexName);
                    col.setIndexType("B+ Tree");
                    table.save();
                    break;
                }
            }
            MetaData.updateOnMetaDataFile(strTableName, strColName, strIndexName);
            BPlusIndex b = IndexControler.createIndex(table, strColName, strIndexName);
            allBPlusIndecies.add(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // following method inserts one row only.
    // htblColNameValue must include a value for the primary key
    public void insertIntoTable(String strTableName,
                                Hashtable<String, Object> htblColNameValue) throws DBAppException, IOException, ClassNotFoundException {
        //checking whether the table exists or not
        boolean tableExists = false;
        for (Table table : allTables)
            if (table.getTableName().equals(strTableName))
                tableExists = true;
        if (tableExists)
            Table.getTable(this.allTables, strTableName).insertIntoTable(htblColNameValue);
        else
            throw new DBAppException("The table is not implemented yet");
    }

    // following method updates one row only
    // htblColNameValue holds the key and new value
    // htblColNameValue will not include clustering key as column name
    // strClusteringKeyValue is the value to look for to find the row to update.
    public void updateTable(String strTableName,
                            String strClusteringKeyValue,
                            Hashtable<String, Object> htblColNameValue) throws DBAppException, IOException, ClassNotFoundException {
        // check if htblColNameValue size  = table.allcol.size()
        Table table = Table.getTable(allTables, strTableName);
        TupleValidator.IsValidTuple(htblColNameValue, table);

        Object clusterKeyVal = strClusteringKeyValue;
        Object[] clusterKeyColIndex = (table.getClusterKeyAndIndex());

        switch (((TableColumn) clusterKeyColIndex[0]).getColumnType()) {
            case "java.lang.double":
                clusterKeyVal = Double.parseDouble(strClusteringKeyValue);
                break;
            case "java.lang.Integer":
                clusterKeyVal = Integer.parseInt(strClusteringKeyValue);
                break;
        }
        Hashtable<Integer, Object> colIdxVal = table.getColIdxVal(htblColNameValue);
        Pair<Page, Record> pageAndRecord = table.searchRec( (Comparable) clusterKeyVal,(Integer) clusterKeyColIndex[1]) ;
        if (pageAndRecord != null) {
            int pageIndex = table.getPagePaths().indexOf(pageAndRecord.x.getPagePath()) ;
            pageAndRecord.y.updateRecord(colIdxVal , htblColNameValue , clusterKeyVal ,pageIndex,table);
            pageAndRecord.x.save();
                table.save();
        }
    }

    // following method could be used to delete one or more rows.
    // htblColNameValue holds the key and value. This will be used in search
    // to identify which rows/tuples to delete.
    // htblColNameValue enteries are ANDED together
    public void deleteFromTable(String strTableName,
                                Hashtable<String, Object> htblColNameValue) throws DBAppException, IOException, ClassNotFoundException {
        Table table = Table.getTable(allTables, strTableName);
        int rowsAffected = 0;

        // map column name to idx
        Hashtable<Integer, Object> colIdxVal = table.getColIdxVal(htblColNameValue);
        // will hold pointers to matching records
        Vector<Pointer> bplusFilter = null;
        // hold index of columns with b plus tree
        ArrayList<Integer> colIdxWBplus = table.colIdxWBPlus();
        // hold all bplusaffected
        ArrayList<BPlusIndex> affectedBPlus = new ArrayList<>(colIdxWBplus.size());
        for (int i : colIdxWBplus) {
            TableColumn col = table.getAllColumns().get(i);
            BPlusIndex bplus = IndexControler.readIndexByName(col.getIndexName(), table);
            affectedBPlus.add(bplus);
            // search for queried value
            Vector<Pointer> pointers = bplus.search(colIdxVal.get(i));
            if (bplusFilter == null)
                bplusFilter = pointers;
            else
                Operations.intersect(bplusFilter, pointers);
        }
        // remove columns with bplus
        colIdxWBplus.forEach(colIdxVal.keySet()::remove);
//        colIdxVal.keySet().removeAll(colIdxWBplus);
        // if found index
        /* to be optimized further if cluster key is provided*/
        if (bplusFilter != null) {
            bplusFilter.sort(Pointer::compareTo);
            Page page = null;
            // records to remove
            ArrayList<Record> toRemove = new ArrayList<>();
            // their pointers
            ArrayList<Pointer> ptrsToRemove = new ArrayList<>();
            for (int i = 0; i < bplusFilter.size(); i++) {
                // if no page loaded or need new page then load new page
                if (page == null ||
                        !bplusFilter.get(i - 1).clusterKeyValue.equals(bplusFilter.get(i).clusterKeyValue)){
                    if(page != null){
                        // remove records first
                        page.removeAll(toRemove);
                        for(int currCol : colIdxWBplus){
                            // bplus tree of current column
                            BPlusIndex currBplus = affectedBPlus.get(currCol);
                            for(int j = 0; j < toRemove.size(); j++){
                                Object key = toRemove.get(j).get(currCol);
                                Pointer p = ptrsToRemove.get(j);
                                currBplus.delete(key, p);
                            }
                        }
                        page.save();
                    }
                    page = (Page) FileCreator.readObject(table.getPagePaths().get(i));
                }

                Record record = page.searchRecord(
                        bplusFilter.get(i).clusterKeyValue,
                        (int) table.getClusterKeyAndIndex()[1]);

                if(record.isMatching(colIdxVal)){
                    toRemove.add(record);
                    ptrsToRemove.add(bplusFilter.get(i));
                    rowsAffected++;
                }
            }
            System.out.println(rowsAffected);
            for(BPlusIndex bp : affectedBPlus)
                bp.save();
            table.save();
            return;
        }
        // check whether hashtable has cluster key
        // if so binary search then check if matching -------- to be implemented s------------
        for (String path : table.getPagePaths()) {
            // still need to adjust for index
            Page page = (Page) FileCreator.readObject(path);
            ArrayList<Record> toRemove = new ArrayList<>();
            for (Record record : page) {
                boolean matching = record.isMatching(colIdxVal);
                if (matching)
                    toRemove.add(record);
            }
            page.removeAll(toRemove);
            page.save();
        }
        System.out.println(rowsAffected);
        table.save();

                //////////////////////////////////////////////////
                // not completed yet
//        for (BPlusIndex b : allBPlusIndecies) {
//            Enumeration<String> keys = htblColNameValue.keys();
//            Enumeration<Object> values = htblColNameValue.elements();
//            while (keys.hasMoreElements()) {
//                String key = keys.nextElement();
//                Object value = values.nextElement();
//                if (b.getTableName().equals(strTableName) && b.getColName().equals(key)) {
//                    b.delete(value);
//                }
//            }
//        }
    }
    // age = 20 , gpa = 3.4, name = ahmed
    // {pointers} and gpa = 3.4 or {pointers}
    // {pointers} or {pointers}
    public Iterator selectFromTable(SQLTerm[] arrSQLTerms,
                                    String[] strarrOperators) throws DBAppException, IOException, ClassNotFoundException {
        ArrayList<Object> validRecords = new ArrayList<>();
        Table table = Table.getTable(allTables, arrSQLTerms[0]._strTableName);
        ArrayList<Vector<Pointer>> converted = new ArrayList<>();
        for(int i = 0; i<arrSQLTerms.length; i++){
            TableColumn col = table.getColumnByName(arrSQLTerms[i]._strColumnName);
            if(col.isColumnBIdx()){
                converted.add(IndexControler.search(table, col.getColumnName(), arrSQLTerms[i]._objValue));
                arrSQLTerms[i] = null;
            }
            else
                converted.add(null);
        }

        for (String path : table.getPagePaths()) {
            Page page = (Page) FileCreator.readObject(path);
            for (Record record : page) {
                if (SQLTerm.evalExp(arrSQLTerms, record, table, strarrOperators)) {
                    validRecords.add(record);
                }
            }
        }
        if (validRecords.size() == 0) {
            validRecords.add("No valid results");
        }
        return validRecords.iterator();
    }
    // below method returns Iterator with result set if passed
    // strbufSQL is a select, otherwise returns null.
    public Iterator parseSQL( StringBuffer strbufSQL ) throws
            DBAppException{
        return null;
    }

    public void deleteTable(String tableName) throws DBAppException {
        Table.getTable(allTables, tableName).removeTable();

    }

    public static void main(String[] args) {
        try {
            DBApp dbApp = new DBApp();
//----------------------------------------Students Table-------------------------------------------------------
            String strTableName = "Student";
//            Hashtable htblColNameType = new Hashtable();
//            htblColNameType.put("name", "java.lang.String");
//            htblColNameType.put("gpa", "java.lang.double");
//            htblColNameType.put("id", "java.lang.Integer");
//            dbApp.createTable(strTableName, "id", htblColNameType);
//            dbApp.createIndex(strTableName, "id", "idIndex");
//            dbApp.createIndex(strTableName, "gpa", "gpaIndex");

//            Table table = Table.getTable(dbApp.allTables,"Student");
//            table.reset();

//            Random random = new Random();
//            for (int i = 0; i < 24; i++) {
//                String alpha = "abcdefghijklmnopqrstuvwxyz";
//                int randomNumber = random.nextInt(100000) + 1;
//                double randGpa = random.nextDouble(5);
//                int randAlpha = random.nextInt(26);
//                String name = "";
//                for(int j = 0; j<4; j++){
//                    randAlpha = random.nextInt(26);
//                    name += alpha.charAt(randAlpha);
//                }
//                Hashtable<String, Object> htblColNameValue = new Hashtable<>();
//                htblColNameValue.put("name", name);
//                htblColNameValue.put("gpa", randGpa);
//                htblColNameValue.put("id", randomNumber);
//                dbApp.insertIntoTable(strTableName, htblColNameValue);
//            }

//-----------------------------------------TAs Table-------------------------------------------------------
//            String strTableName = "TAs";
//            Hashtable htblColNameType = new Hashtable();
//            htblColNameType.put("name", "java.lang.String");
//            htblColNameType.put("salary", "java.lang.double");
//            htblColNameType.put("id", "java.lang.Integer");
//            dbApp.createTable(strTableName, "id", htblColNameType);
//            dbApp.createIndex(strTableName, "id", "idIndex");
//            dbApp.createIndex(strTableName, "salary", "salaryIndex");

            Random random = new Random();
            for (int i = 0; i < 24; i++) {
                String alpha = "abcdefghijklmnopqrstuvwxyz";
                int randomid = random.nextInt(100000) + 1;
                double randSalary = random.nextInt(5000);
                int randAlpha = random.nextInt(26);
                String name = "";
                for(int j = 0; j<4; j++){
                    randAlpha = random.nextInt(26);
                    name += alpha.charAt(randAlpha);
                }
                Hashtable<String, Object> htblColNameValue = new Hashtable<>();
                htblColNameValue.put("salary", randSalary);
                htblColNameValue.put("name", name);
                htblColNameValue.put("id", randomid);
                dbApp.insertIntoTable(strTableName, htblColNameValue);
            }
//--------------------------------------------------------------------------------------------------------
//            System.out.println(MetaData.maxPageSize);
//            table.viewTable();

//            Vector<BPlusIndex> res = loadAllTableIndices("Student");
//            System.out.println(res.size());
//            System.out.println((int)Table.getTable(dbApp.allTables,"Student").getClusterKeyAndIndex()[1]);
//            System.out.println(Integer.valueOf((Table.getTable(dbApp.allTables, "Student").getClusterKeyAndIndex()).toString()));
//            System.out.println(Table.getTable(dbApp.allTables,"Student").getClusterKeyAndIndex()[1]);
//            table.viewTable();
////            table.removeTable();
//
//            System.out.println(FileCreator.readObject("E:\\DB 2 proj\\DB engine\\Data_Entry\\Tables\\Student\\Indices\\gpaIndex"));
//            System.out.println(FileCreator.readObject("E:\\DB 2 proj\\DB engine\\Data_Entry\\Tables\\Student\\Indices\\idIndex"));
//            FileRemover.removeFileFromDirectory("Student" , "Student1");
//            System.out.println(MetaData.maxPageSize);
//            Hashtable htblColNameType = new Hashtable();
//            htblColNameType.put("name", "java.lang.String");
//            htblColNameType.put("gpa", "java.lang.double");
//            htblColNameType.put("id", "java.lang.Integer");
//            dbApp.createTable(strTableName, "id", htblColNameType);
//            dbApp.createIndex(strTableName, "id", "idIndex");
//            dbApp.createIndex(strTableName, "gpa", "gpaIndex");

//            Hashtable<String, String> htblColNameType2 = new Hashtable<>();
//            htblColNameType2.put("title", "java.lang.String");
//            htblColNameType2.put("author", "java.lang.String");
//            htblColNameType2.put("year", "java.lang.Integer");
//            dbApp.createTable("Book", "title", htblColNameType2);
//            dbApp.createIndex( strTableName, "name", "nameIndex" );

//            System.out.println(tabel.getAllColumns().get(2).isClusterKey());

//            System.out.println(tabel.getAllColumns().get(0));
//            System.out.println(tabel.getAllColumns().get(1));
//            System.out.println(tabel.getAllColumns().get(2));

//
//
//            htblColNameValue.put("id", new Integer(2343432));
//            htblColNameValue.put("name", new String("Ahmed Noor"));
//            htblColNameValue.put("gpa", new Double(0.95));
//            dbApp.insertIntoTable(strTableName, htblColNameValue);
//            FileRemover.removeFileFromDirectory("Student" , "Student1");
//            Table.getTable(dbApp.allTables,"Student").viewTable();

//            Hashtable htblColNameValue = new Hashtable();
//            dbApp.deleteTable("Student");
//            htblColNameValue.put("id", new Integer(2343432));
//            htblColNameValue.put("name", new String("Ahmed Noor"));
//            htblColNameValue.put("gpa", new Double(0.95));

//            htblColNameValue.put("id", new Integer( 12 ));
//            htblColNameValue.put("name", new String("Ahmed Noor" ) );
//            htblColNameValue.put("gpa", new Double( 0.95 ) );
//            dbApp.insertIntoTable( strTableName , htblColNameValue );
////
//            Hashtable htblColNameValue = new Hashtable();
//            Random random = new Random();
//            Hashtable<String, Object> htblColNameType2 = new Hashtable<>();
//            for (int i = 0; i < 1000; i++) {
//                StringBuilder sb = new StringBuilder(20);
//                for (int j = 0; j < 20; j++) {
//                    char randomChar = (char) (random.nextInt(26) + 'a'); // Generate a random lowercase letter
//                    sb.append(randomChar);
//                }
//
//            String randomString = sb.toString();
//            htblColNameType2.put("title", randomString);
//            htblColNameType2.put("author", "samaloty");
//            htblColNameType2.put("year", 1900);
//            dbApp.insertIntoTable("Book", htblColNameType2);
//            }
//            htblColNameValue.clear();


//            Hashtable htblColNameValue = new Hashtable();
//            htblColNameValue.put("id", new Integer(5674567));
//            htblColNameValue.put("name", new String("Dalia Noor"));
//            htblColNameValue.put("gpa", new Double(1.25));
//            dbApp.insertIntoTable(strTableName, htblColNameValue);

//            htblColNameValue.clear( );
//            htblColNameValue.put("id", new Integer( 23498 ));
//            htblColNameValue.put("name", new String("John Noor" ) );
//            htblColNameValue.put("gpa", new Double( 1.5 ) );
//            dbApp.insertIntoTable( strTableName , htblColNameValue );
//
//            htblColNameValue.clear( );
//            htblColNameValue.put("id", new Integer( 78452 ));
//            htblColNameValue.put("name", new String("Zaky Noor" ) );
//            htblColNameValue.put("gpa", new Double( 0.88 ) );
//            dbApp.insertIntoTable( strTableName , htblColNameValue );


//            Page p = new Page(tabel);
//            Record r = new Record();
//            r.add(0.79);
//            r.add("saeed");
//            r.add(1);
//            p.add(r);
//            p.save();
//            tabel.save();
//            System.out.println(p);


//            htblColNameValue.clear();
//            htblColNameValue.put("name" , "Mahmoud");
//            htblColNameValue.put("gpa" , new Integer(9));
//            dbApp.updateTable("Student", "9", htblColNameValue);
//            System.out.println(table.getPagePaths().get(0));
////            Page p = ((Page) FileCreator.readObject(table.getPagePaths().get(0)));
//            System.out.println(p);
//            table.viewTable();

//            System.out.println("Selection Results:__________");
//            SQLTerm[] arrSQLTerms;
//            arrSQLTerms = new SQLTerm[]{new SQLTerm() , new SQLTerm()};
//            arrSQLTerms[0]._strTableName =  "Student";
//            arrSQLTerms[0]._strColumnName=  "name";
//            arrSQLTerms[0]._strOperator  =  "=";
//            arrSQLTerms[0]._objValue     =  "John Noor";
//
//            arrSQLTerms[1]._strTableName =  "Student";
//            arrSQLTerms[1]._strColumnName=  "gpa";
//            arrSQLTerms[1]._strOperator  =  ">";
//            arrSQLTerms[1]._objValue     =  new Double( 9.9 );
//
//            String[]strarrOperators = new String[1];
//            strarrOperators[0] = "OR";

            // select * from Student where name = "John Noor" or gpa = 1.5;
//            Iterator resultSet = dbApp.selectFromTable(arrSQLTerms , strarrOperators);
//            while(resultSet.hasNext()) {
//                System.out.println(resultSet.next());
//            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

}