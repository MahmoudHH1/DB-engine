import Data.Handler.FileCreator;
import Data.Index.BPlusIndex;
import Data.Index.IndexControler;
import Data.Page.Page;
import Data.Page.Record;
import Data.Table.MetaData;
import Data.Table.Table;
import Data.Table.TableColumn;
import Data.Validator.TupleValidator;
import Exceptions.DBAppException;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static Data.Index.IndexControler.loadAllTableIndices;


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
            throw new DBAppException("not implemented yet");
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
        for (String path : table.getPagePaths()) {
            Page page = (Page) FileCreator.readObject(path);
            Record record = page.searchRecord(clusterKeyVal, (Integer) clusterKeyColIndex[1]);
            if (record != null) {
                record.updateRecord(colIdxVal);
                page.save();
                table.save();
            }
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
        // table.save();
        //////////////////////////////////////////////////
        // not completed yet
        for (BPlusIndex b : allBPlusIndecies) {
            Enumeration<String> keys = htblColNameValue.keys();
            Enumeration<Object> values = htblColNameValue.elements();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
                Object value = values.nextElement();
                if (b.getTableName().equals(strTableName) && b.getColName().equals(key)) {
                    b.delete(value);
                }
            }
        }
    }

    public Iterator selectFromTable(SQLTerm[] arrSQLTerms,
                                    String[] strarrOperators) throws DBAppException, IOException, ClassNotFoundException {
        ArrayList<Object> validRecords = new ArrayList<>();
        Table table = Table.getTable(allTables, arrSQLTerms[0]._strTableName);
        for (String path : table.getPagePaths()) {
            Page page = (Page) FileCreator.readObject(path);
            for (Record record : page) {
                if (SQLTerm.evalExp(arrSQLTerms, record, table, strarrOperators)) {
                    validRecords.add(record);
                }
                ;
            }
        }
        if (validRecords.size() == 0) {
            validRecords.add("No valid results");
        }
        return validRecords.iterator();
    }

    public void deleteTable(String tableName) throws DBAppException {
        Table.getTable(this.allTables, tableName).removeTable();
    }

    public static void main(String[] args) {
        try {
            String strTableName = "Student";
            DBApp dbApp = new DBApp();
//            Vector<BPlusIndex> res = loadAllTableIndices("Student");
//            System.out.println(res.size());
//            System.out.println((int)Table.getTable(dbApp.allTables,"Student").getClusterKeyAndIndex()[1]);
//            System.out.println(Integer.valueOf((Table.getTable(dbApp.allTables, "Student").getClusterKeyAndIndex()).toString()));
//            System.out.println(Table.getTable(dbApp.allTables,"Student").getClusterKeyAndIndex()[1]);
//            Table table = Table.getTable(dbApp.allTables,"Student");
////            table.viewTable();
////            table.viewTable();
//            table.removeTable();

//            FileRemover.removeFileFromDirectory("Student" , "Student1");
            Random random = new Random();
////
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(1000) + 1;
                Hashtable<String, Object> htblColNameValue = new Hashtable<>();
                htblColNameValue.put("name", "Samaloty");
                htblColNameValue.put("gpa", 0.1);
                htblColNameValue.put("id", randomNumber );
                dbApp.insertIntoTable(strTableName, htblColNameValue);
            }
//            Hashtable htblColNameType = new Hashtable();
//            htblColNameType.put("name", "java.lang.String");
//            htblColNameType.put("gpa", "java.lang.double");
//            htblColNameType.put("id", "java.lang.Integer");
//            dbApp.createTable(strTableName, "id", htblColNameType);
//            dbApp.createIndex(strTableName, "id", "idIndex");

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