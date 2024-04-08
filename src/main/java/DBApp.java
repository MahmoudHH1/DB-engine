import Data.Handler.Pair;
import Data.Index.BPlusIndex;
import Data.Index.IndexControler;
import Data.Index.Pointer;
import Data.Page.Page;
import Data.Page.Record;
import Data.Table.MetaData;
import Data.Table.Table;
import Data.Table.TableColumn;
import Data.Validator.TupleValidator;
import Exceptions.DBAppException;
import Grammars.gen.Grammars.SqlLexer;
import Grammars.gen.Grammars.SqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.*;



public class DBApp {
    public static ArrayList<Table> allTables;
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

        if (Table.exists(allTables, strTableName)) {
            throw new DBAppException("Table already exists");
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
                            String strIndexName) throws DBAppException, IOException, ClassNotFoundException {
        Table table = Table.getTable(allTables, strTableName);

        TableColumn col = table.getColumnByName(strColName);
        if(col.isColumnBIdx())
            throw new DBAppException("There is already an index on that column");
        if(table.getAllColumnBIdxsNames().contains(strIndexName))
            throw new DBAppException("There is already an index by that name");

        col.setIndexName(strIndexName);
        col.setIndexType("B+ Tree");
        table.save();

        MetaData.updateOnMetaDataFile(strTableName, strColName, strIndexName);
        BPlusIndex b = IndexControler.createIndex(table, strColName, strIndexName);
        allBPlusIndecies.add(b);
    }

    // following method inserts one row only.
    // htblColNameValue must include a value for the primary key
    public void insertIntoTable(String strTableName,
                                Hashtable<String, Object> htblColNameValue) throws DBAppException, IOException, ClassNotFoundException {
        //checking whether the table exists or not
        boolean tableExists = false;
        for (Table table : allTables)
            if (table.getTableName().equals(strTableName)) {
                tableExists = true;
                break;
            }
        if (tableExists)
            Table.getTable(allTables, strTableName).insertIntoTable(htblColNameValue);
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
            case "java.lang.double" -> clusterKeyVal = Double.parseDouble(strClusteringKeyValue);
            case "java.lang.Integer" -> clusterKeyVal = Integer.parseInt(strClusteringKeyValue);
        }
        Hashtable<Integer, Object> colIdxVal = table.getColIdxVal(htblColNameValue);
        Pair<Page, Record> pageAndRecord = table.searchRec( (Comparable) clusterKeyVal,(Integer) clusterKeyColIndex[1]) ;
        if (pageAndRecord != null) {
            int pageIndex = table.getPagePaths().indexOf(pageAndRecord.x.getPagePath());
            pageAndRecord.y.updateRecord(colIdxVal , htblColNameValue , clusterKeyVal ,pageIndex,table);
            pageAndRecord.x.save();
            table.save();
        }else{
            throw new DBAppException("The cluster Key :"+ clusterKeyVal +" Dosen't exist");
        }
    }

    // following method could be used to delete one or more rows.
    // htblColNameValue holds the key and value. This will be used in search
    // to identify which rows/tuples to delete.
    // htblColNameValue enteries are ANDED together
    public void deleteFromTable(String strTableName,
                                Hashtable<String, Object> htblColNameValue) throws DBAppException, IOException, ClassNotFoundException {
        Table table = Table.getTable(allTables, strTableName);
        TupleValidator.IsValidTuple(htblColNameValue, table);

        int rowsAffected = 0;
        int clusterKeyIdx = (int) table.getClusterKeyAndIndex()[1];

        // map column name to idx
        Hashtable<Integer, Object> colIdxVal = table.getColIdxVal(htblColNameValue);
        // will hold pointers to matching records
        Vector<Pointer> bplusFilter = null;
        // hold index of columns with b plus tree
        ArrayList<Integer> colIdxWBplus = table.colIdxWBPlus();
        // hold all bplusaffected
        ArrayList<BPlusIndex> affectedBPlus = new ArrayList<>(colIdxWBplus.size());

        // search for matching pointers using index
        bplusFilter = IndexControler.searchIntersect(table, colIdxWBplus, colIdxVal, affectedBPlus);
        // if clusterKey is queried only one record can be deleted
        if(colIdxVal.containsKey(clusterKeyIdx)){
            Pointer primaryPointer = new Pointer(0, colIdxVal.get(clusterKeyIdx));
            // if pointer is already bplusFilter remove all other pointers
            // otherwise binarysearch and put its pointer as the only
            if(bplusFilter != null){
                int i = bplusFilter.indexOf(primaryPointer);
                if(i < 0){
                    // not found so no rows will match
                    System.out.println("rows Affected: " + rowsAffected);
                    return;
                }
                primaryPointer = bplusFilter.get(i);
            } else {
                int pageIdx = (table.search((Comparable) colIdxVal.get(clusterKeyIdx), clusterKeyIdx)).x;
                primaryPointer = new Pointer(pageIdx, colIdxVal.get(clusterKeyIdx));
            }
            bplusFilter = new Vector<>(1);
            bplusFilter.add(primaryPointer);
        }

        // remove columns with bplus
        colIdxWBplus.forEach(colIdxVal.keySet()::remove);
        // if found index
        /* to be optimized further if cluster key is provided*/
        if (bplusFilter != null) {
            bplusFilter.sort(Pointer::compareTo);
            Page page = null;
            // records to remove
            ArrayList<Record> toRemove = new ArrayList<>();
            // their pointers
            ArrayList<Pointer> ptrsToRemove = new ArrayList<>();

            int last = 0;
            for (int i = 0; i < bplusFilter.size(); i++) {
                Pointer currPtr = bplusFilter.get(i);
                // if no page loaded or need new page then load new page
                if(page == null)
                    page = Page.readPage(table.getPagePaths().get(currPtr.pageIdx), table);
                else if (bplusFilter.get(i - 1).pageIdx != currPtr.pageIdx){
                    // remove records first from page
                    // remove from all indicies
                    page.removeAll(toRemove, colIdxWBplus,
                            affectedBPlus, ptrsToRemove, bplusFilter.get(i-1).pageIdx);
                    page = Page.readPage(table.getPagePaths().get(currPtr.pageIdx), table);
                    // reset arraylists
                    toRemove = new ArrayList<>();
                    ptrsToRemove = new ArrayList<>();
                }

                Record record = page.searchRecord(
                        currPtr.clusterKeyValue,
                        clusterKeyIdx);

                if(record.isMatching(colIdxVal)){
                    toRemove.add(record);
                    ptrsToRemove.add(bplusFilter.get(i));
                    rowsAffected++;
                }
                last = currPtr.pageIdx ;
            }
            // in case remains records
            if(!toRemove.isEmpty()){
                page.removeAll(toRemove, colIdxWBplus, affectedBPlus, ptrsToRemove, last);
            }

            System.out.println(rowsAffected + " rows affected");
            for(BPlusIndex bp : affectedBPlus)
                bp.save();
            table.save();
            return;
        }
        // linear
        // check whether hashtable has cluster key
        // if so binary search then check if matching -------- to be implemented s------------
        for (int i = 0; i< table.getPagePaths().size(); i++) {

            // still need to adjust for index
            Page page = Page.readPage(table.getPagePaths().get(i), table);
            ArrayList<Record> toRemove = new ArrayList<>();
            ArrayList<Pointer> ptrsToRemove = new ArrayList<>();
            for (Record record : page) {
                boolean matching = record.isMatching(colIdxVal);
                if (matching){
                    toRemove.add(record);
                    ptrsToRemove.add(new Pointer(i,record.get(clusterKeyIdx)));
                    rowsAffected++;
                }
            }
            page.removeAll(toRemove, colIdxWBplus, affectedBPlus, ptrsToRemove, i);
        }
        System.out.println(rowsAffected + " rows affected");
        for(BPlusIndex bp : affectedBPlus)
            bp.save();
        table.save();
    }
    // age = 20 , gpa = 3.4, name = ahmed
    // {pointers} and gpa = 3.4 or {pointers}
    // {pointers} or {pointers}
    // select * from student where age = 20 and name = ahmed
    // select * from student where age = 20 or name = ahmed
    // select * from student where age = 20 xor name = ahmed
    public Iterator selectFromTable(SQLTerm[] arrSQLTerms,
                                    String[] strarrOperators) throws DBAppException, IOException, ClassNotFoundException {
        SQLTerm.validateSqlTerms(arrSQLTerms);
        ArrayList<Object> validRecords = new ArrayList<>();
        Table table = Table.getTable(allTables, arrSQLTerms[0]._strTableName);

        // check whether arrSQLTerms is empty???
        ArrayList<Vector<Pointer>> converted = new ArrayList<>(arrSQLTerms.length);

        if(SQLTerm.allColummnsBplus(table, arrSQLTerms, strarrOperators)){
            for(int i = 0; i<arrSQLTerms.length; i++){
                TableColumn col = table.getColumnByName(arrSQLTerms[i]._strColumnName);
                converted.add(IndexControler.search(table, col.getColumnName(), arrSQLTerms[i]._objValue, arrSQLTerms[i]._strOperator));
                arrSQLTerms[i] = null;
            }
            ArrayList<Pointer> result = SQLTerm.evalPtrs(converted, strarrOperators);
            if(result == null){
                validRecords.add(null);
                return validRecords.iterator();
            }
            result.sort(Pointer::compareTo);
            Page page = null;
            for(int i = 0; i<result.size(); i++){
                Pointer currPtr = result.get(i);
                if(page == null || result.get(i-1).pageIdx != currPtr.pageIdx)
                    page = Page.readPage(table.getPagePaths().get(currPtr.pageIdx), table);

                Record record = page.searchRecord(currPtr.clusterKeyValue,
                        (int) table.getClusterKeyAndIndex()[1]);
                validRecords.add(record);
            }
        }
        else {
            for (String path : table.getPagePaths()) {
                Page page = Page.readPage(path, table);
                for (Record record : page) {
                    if (SQLTerm.evalExp(arrSQLTerms, record, table, strarrOperators)) {
                        validRecords.add(record);
                    }
                }
            }
            if (validRecords.isEmpty()) {
                validRecords.add(null);
            }
        }
        return validRecords.iterator();
    }
    // below method returns Iterator with result set if passed
    // strbufSQL is a select, otherwise returns null.
    public Iterator parseSQL( StringBuffer strbufSQL ) throws
            DBAppException{
        CharStream SQLin = CharStreams.fromString(strbufSQL.toString());

        SqlLexer lexer = new SqlLexer(SQLin);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokens);
        SqlParser.ParseContext tree = parser.parse();

        return null;
    }

    public void deleteTable(String tableName) throws DBAppException {
        Table.getTable(allTables, tableName).removeTable();

    }

    public static void main(String[] args) {
        try {
            DBApp dbApp = new DBApp();
//----------------------------------------Students Table-------------------------------------------------------
            // ** Create **
            String strTableName = "Student";
//            Hashtable htblColNameType = new Hashtable();
//            htblColNameType.put("name", "java.lang.String");
//            htblColNameType.put("gpa", "java.lang.double");
//            htblColNameType.put("id", "java.lang.Integer");
//            dbApp.createTable(strTableName, "id", htblColNameType);
//            dbApp.createIndex(strTableName, "gpa", "gpaIndex");
            Table table = Table.getTable(allTables,"Student");
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
//            // ** insert **
//            Random random = new Random();
//            double[] gpas = {1.8707343572991275, 4.794898718343688, 4.248665186144998, 3.17081958974137, 0.09320194237640356, 0.9725099510902641, 4.089370321938262, 1.6642600553325182, 1.3182128065760583, 4.998746444195267};
//            int[] ids = {60140, 66455, 53268, 43418, 49819, 3715, 93972, 18801, 41104, 40187};
//            for (int i = 0; i < 10; i++) {
//                String alpha = "abcdefghijklmnopqrstuvwxyz";
////            int randomNumber = random.nextInt(100000) + 1;
//                int randomNumber = ids[i];
////            double randGpa = random.nextDouble(5);
//                double randGpa = gpas[i];
//                int randAlpha;
//                String name = "";
//                for (int j = 0; j < 4; j++) {
//                    randAlpha = random.nextInt(26);
//                    name += alpha.charAt(randAlpha);
//                }
//                htblColNameValue.put("name", name);
//                htblColNameValue.put("gpa", randGpa);
//                htblColNameValue.put("id", randomNumber);
//                dbApp.insertIntoTable(strTableName, htblColNameValue);
//            }
//            System.out.println("😂😂😂Start Values😂😂");
//            table.viewTable();
//            System.out.println(IndexControler.readIndexByName("gpaIndex", table));
//            System.out.println("test after insertion is : "+ IndexControler.testIndexTable(table));
//////                                           //  ** update **
//            htblColNameValue.clear();
//            htblColNameValue.put("name", "Saeed");
//            htblColNameValue.put("gpa", 500.001);
//            dbApp.updateTable("Student", "3715", htblColNameValue);
//            dbApp.updateTable("Student", "93972", htblColNameValue);
//            dbApp.updateTable("Student", "40187", htblColNameValue);
//            dbApp.updateTable("Student", "60140", htblColNameValue);
//            System.out.println("😂😂😂Updated😂😂");
            table.viewTable();
            System.out.println(IndexControler.readIndexByName("gpaIndex", table));
            System.out.println("test after update : "+IndexControler.testIndexTable(table));
            // ** delete **
            System.out.println("👻💀Deleted💀👻");
//            htblColNameValue.clear();
            htblColNameValue.put("name", "yjmb");
            htblColNameValue.put("gpa", 1.6642600553325182);
//            htblColNameValue.put("id" ,40187);
            dbApp.deleteFromTable("Student", htblColNameValue);
            table.viewTable();
            System.out.println(IndexControler.readIndexByName("gpaIndex", table));
            System.out.println("test after deletion : "+IndexControler.testIndexTable(table));
//-----------------------------------------TAs Table-------------------------------------------------------
//            String strTableName = "TAs";
//            Hashtable htblColNameType = new Hashtable();
//            htblColNameType.put("name", "java.lang.String");
//            htblColNameType.put("salary", "java.lang.double");
//            htblColNameType.put("id", "java.lang.Integer");
//            dbApp.createTable(strTableName, "id", htblColNameType);
//            dbApp.createIndex(strTableName, "id", "idIndex");
//            dbApp.createIndex(strTableName, "salary", "salaryIndex");
//

//            System.out.println(IndexControler.readIndexByName("idIndex", table));
//            System.out.println("😂😂😂😂😂");
//            System.out.println(IndexControler.readIndexByName("salaryIndex", table));

//            table.reset();
//            Random random = new Random();
//            for (int i = 0; i < 7; i++) {
//                String alpha = "abcdefghijklmnopqrstuvwxyz";
//                int randomid = random.nextInt(100000) + 1;
//                double randSalary = random.nextDouble(5000);
//                int randAlpha = random.nextInt(26);
//                String name = "";
//                for(int j = 0; j<4; j++){
//                    randAlpha = random.nextInt(26);
//                    name += alpha.charAt(randAlpha);
//                }
//                Hashtable<String, Object> htblColNameValue = new Hashtable<>();
//                htblColNameValue.put("name", name);
//                htblColNameValue.put("id", randomid);
//                htblColNameValue.put("salary", randSalary);
//                dbApp.insertIntoTable(strTableName, htblColNameValue);
//            }
//            table.viewTable();

//--------------------------------------------------------------------------------------------------------
          System.out.println("Selection Results:__________");
          SQLTerm[] arrSQLTerms;
          arrSQLTerms = new SQLTerm[1];
          arrSQLTerms[0]=new SQLTerm();
//          arrSQLTerms[1]=new SQLTerm();
//          arrSQLTerms[0]._strTableName =  "Student";
//          arrSQLTerms[0]._strColumnName=  "name";
//          arrSQLTerms[0]._strOperator  =  "=";
//          arrSQLTerms[0]._objValue     =  "ytsl";
//
          arrSQLTerms[0]._strTableName =  "Student";
          arrSQLTerms[0]._strColumnName=  "gpa";
          arrSQLTerms[0]._strOperator  =  ">";
          arrSQLTerms[0]._objValue     =   3.1;
//
          String[]strarrOperators = new String[0];
//          strarrOperators[0] = "AND";
//
          // select * from Student where name = "John Noor" or gpa = 1.5;
          Iterator resultSet = dbApp.selectFromTable(arrSQLTerms , strarrOperators);
          while(resultSet.hasNext()) {
              System.out.println(resultSet.next());
          }
      } catch (Exception exp) {
          System.out.println(exp.getClass() + ": " + exp.getMessage() + " because " + exp.getCause() );
          exp.printStackTrace();

      }
    }


    }