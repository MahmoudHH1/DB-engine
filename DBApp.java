


import Data.Page.Page;
import Data.Page.Record;
import Data.Table.MetaData;
import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import java.io.IOException;
import java.util.*;


public class DBApp {
    public ArrayList<Table> allTables;

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
        ArrayList<TableColumn> allColumns = new ArrayList<>();
        for (String column : htblColNameType.keySet()) {
            TableColumn newColumn = new TableColumn(
                    strTableName,
                    column,
                    htblColNameType.get(column),
                    column.equals(strClusteringKeyColumn),
                    null,
                    null
            );
            allColumns.add(newColumn);
        }
        Table table = new Table(allColumns);
    }


    // following method creates a B+tree index
    public void createIndex(String strTableName,
                            String strColName,
                            String strIndexName) throws DBAppException {

        throw new DBAppException("not implemented yet");
    }


    // following method inserts one row only.
    // htblColNameValue must include a value for the primary key
    public void insertIntoTable(String strTableName,
                                Hashtable<String, Object> htblColNameValue) throws DBAppException {
        /*
        Assumptions
        when deleting I assume that the table is deleted form the arraylist containing all table

         */
        //-----------------------------------------------------------------------\\
        //checking whether the table exists or not
        boolean tableExists = false;
        for (Table table : allTables)
            if (table.getTableName().equals(strTableName))
                tableExists = true;
        //-----------------------------------------------------------------------\\
        if (tableExists) {
            // checking whether the inserted tuple have the same is valid one

        } else
            throw new DBAppException("The table is not implemented yet");
    }


    // following method updates one row only
    // htblColNameValue holds the key and new value
    // htblColNameValue will not include clustering key as column name
    // strClusteringKeyValue is the value to look for to find the row to update.
    public void updateTable(String strTableName,
                            Object strClusteringKeyValue,
                            Hashtable<String, Object> htblColNameValue) throws DBAppException, IOException {
        Table tabel = Table.getTable(allTables, strTableName);
        outerLoop:
        // to exit all loops
        for (Page page : tabel.getAllPages()) {
            for (Record record : page.getAllRecords()) {
                if (record.containsValue(strClusteringKeyValue)) {
                    for (Map.Entry<String, Object> entry : htblColNameValue.entrySet()) {
                        String columnName = entry.getKey();
                        Object newValue = entry.getValue();
                        record.updateRecord(columnName, newValue);
                        tabel.tableCreator();
                        break outerLoop;
                    }
                }
            }
        }
    }


    // following method could be used to delete one or more rows.
    // htblColNameValue holds the key and value. This will be used in search
    // to identify which rows/tuples to delete.
    // htblColNameValue enteries are ANDED together
    public void deleteFromTable(String strTableName,
                                Hashtable<String, Object> htblColNameValue) throws DBAppException {

        throw new DBAppException("not implemented yet");
    }


    public Iterator selectFromTable(SQLTerm[] arrSQLTerms, String[] strarrOperators) throws DBAppException {
        if (arrSQLTerms == null || strarrOperators == null || arrSQLTerms.length == 0 || strarrOperators.length == 0) {
            throw new DBAppException("Invalid SQL terms or operator");  }
        if (arrSQLTerms.length != strarrOperators.length + 1){
            throw new DBAppException("Invalid inputs"); }
        List<Record> selectedTuples = new ArrayList<>();
        for (int i = 0; i < arrSQLTerms.length; i++) {
            SQLTerm term = arrSQLTerms[i];
            if (term == null || term._strTableName == null || term._strColumnName == null || term._strOperator == null || term._objValue == null) {
                throw new DBAppException("Invalid SQL term"); }
            if (i == 0) {
                selectedTuples.addAll(apply(term)); }
            else {
                String operator = strarrOperators[i - 1]; // to get the logical operator of the current condition
                switch (operator.toUpperCase()) {
                    case "AND":
                        selectedTuples.retainAll(apply(term));
                        break;
                    case "OR":
                        selectedTuples.addAll(apply(term)); // duplicates included 3adi wla eh
                        break;
                    case "XOR": // XOR is everything minus the intersection xy'+ x'y
                        //selectedTuples.addAll(apply(term)); // ghalat
                        //selectedTuples.removeAll(selectedTuples); // (selectedTuples.addAll(apply(term)')).addAll((selectedTuples'.addAll(apply(term))
                        selectedTuples.addAll(apply(term)); // kolo x+y
                        selectedTuples.removeAll(applycomplement(term)); // removing the xy'
                        selectedTuples.addAll(applycomplement(term));  //
                        break;
                    default:
                        throw new DBAppException("Invalid logical operator: " + operator);
                }
            }
        }
        return selectedTuples.iterator();
    }





    // helper method for select to apply the select condition on table
    // one table contains many pages!!!!!!!!!!!!!!!!!!!
    // Table table = Table.getTable(allTables, cond._strTableName);
    // ArrayList<TableColumn> column = table.getAllColumns();
    private ArrayList<Record> apply(SQLTerm cond) throws DBAppException{
        ArrayList<Record> tuples = new ArrayList<>();  /// records that satisfies condition saved here
        for (Table table : allTables) { // loop through all the tables
            if (table.getTableName().equals(cond._strTableName)) { // the table we want
                for (Page page : table.getAllPages()) { //to get all pages of the table
                    for (Record record : page.getAllRecords()) { //to get all records
                        Object columnValue = null;
                        for (TableColumn column : table.getAllColumns()) {
                            if (column.getColumnName().equals(cond._strColumnName)) {
                                columnValue = record.get(column.getColumnName());
                                break;
                            }
                        }
                        // Check if the column value is null
                        if (columnValue == null) {
                            throw new DBAppException("not found");
                        }
                        // Compare the column value with the value specified in the SQLTerm using the operator
                        boolean found = false;
                        Comparable<Object> comparableValue = (Comparable<Object>) columnValue;
                        Comparable<Object> comparableObjValue = (Comparable<Object>) cond._objValue;
                        switch (cond._strOperator) {
                            case "=":
                                found = comparableValue.compareTo(comparableObjValue) == 0;
                                break;
                            case "!=":
                                found = comparableValue.compareTo(comparableObjValue) != 0;
                                break;
                            case ">":
                                found = comparableValue.compareTo(comparableObjValue) > 0;
                                break;
                            case ">=":
                                found = comparableValue.compareTo(comparableObjValue) >= 0;
                                break;
                            case "<":
                                found = comparableValue.compareTo(comparableObjValue) < 0;
                                break;
                            case "<=":
                                found = comparableValue.compareTo(comparableObjValue) <= 0;
                                break;
                            default:
                                throw new DBAppException("Unsupported operator");
                        }
                        if (found) {
                            tuples.add(record);
                        }
                    }
                }
            }
        }

        return tuples;
    }
    private ArrayList<Record> applycomplement(SQLTerm cond) throws DBAppException{
        ArrayList<Record> tuples = new ArrayList<>();  /// records that satisfies condition saved here
        for (Table table : allTables) { // loop through all the tables
            if (table.getTableName().equals(cond._strTableName)) { // the table we want
                for (Page page : table.getAllPages()) { //to get all pages of the table
                    for (Record record : page.getAllRecords()) { //to get all records
                        Object columnValue = null;
                        for (TableColumn column : table.getAllColumns()) {
                            if (column.getColumnName().equals(cond._strColumnName)) {
                                columnValue = record.get(column.getColumnName());
                                break;
                            }
                        }
                        // Check if the column value is null
                        if (columnValue == null) {
                            throw new DBAppException("not found");
                        }
                        // Compare the column value with the value specified in the SQLTerm using the operator
                        boolean found = false;
                        Comparable<Object> comparableValue = (Comparable<Object>) columnValue;
                        Comparable<Object> comparableObjValue = (Comparable<Object>) cond._objValue;
                        switch (cond._strOperator) {
                            case "=":
                                found = comparableValue.compareTo(comparableObjValue) != 0;
                                break;
                            case "!=":
                                found = comparableValue.compareTo(comparableObjValue) == 0;
                                break;
                            case ">":
                                found = comparableValue.compareTo(comparableObjValue) <= 0;
                                break;
                            case ">=":
                                found = comparableValue.compareTo(comparableObjValue) < 0;
                                break;
                            case "<":
                                found = comparableValue.compareTo(comparableObjValue) >= 0;
                                break;
                            case "<=":
                                found = comparableValue.compareTo(comparableObjValue) > 0;
                                break;
                            default:
                                throw new DBAppException("Unsupported operator");
                        }
                        if (found) {
                            tuples.add(record);
                        }
                    }
                }
            }
        }

        return tuples;
    }



    public static void main(String[] args) {
        try {
            String strTableName = "Student";
            DBApp dbApp = new DBApp();
//            Table tabel = Table.getTable(dbApp.allTables, strTableName);
//            System.out.println(tabel.getAllPages().get(1).getAllRecords());

            dbApp.insertIntoTable("samaloty", new Hashtable<>());
            
//		Page p = new Page(tabel);
//		Record r = new Record();
//		r.put("id", Integer.valueOf(1));
//		r.put("name", "Mohamed");
//		r.put("gpa", Double.valueOf(2));
//		p.addRecord(r);
//		tabel.tableCreator();
//		System.out.println(tabel.getPageNum());

//            Hashtable h = new Hashtable<>();
//            h.put("name", "Ali");
//            dbApp.updateTable("Student", Integer.valueOf(1), h);
//            System.out.println(tabel.getAllPages().get(1).getAllRecords());

//		Hashtable htblColNameType = new Hashtable( );
//		htblColNameType.put("name", "java.lang.String");
//		htblColNameType.put("gpa", "java.lang.double");
//		htblColNameType.put("id", "java.lang.Integer");
//		dbApp.createTable( strTableName, "id", htblColNameType );

//		dbApp.createIndex( strTableName, "gpa", "gpaIndex" );


//		Record r = new Record() ;
//		r.put("id", "java.lang.Integer");
//		r.put("Name", "Saeed");
//		r.put("age" , "20");

//		System.out.println(r);


//		Hashtable htblColNameValue = new Hashtable( );
//		htblColNameValue.put("id", new Integer( 2343432 ));
//		htblColNameValue.put("name", new String("Ahmed Noor" ) );
//		htblColNameValue.put("gpa", new Double( 0.95 ) );
//		dbApp.insertIntoTable( strTableName , htblColNameValue );
//
//		htblColNameValue.clear( );
//		htblColNameValue.put("id", new Integer( 453455 ));
//		htblColNameValue.put("name", new String("Ahmed Noor" ) );
//		htblColNameValue.put("gpa", new Double( 0.95 ) );
//		dbApp.insertIntoTable( strTableName , htblColNameValue );
//
//		htblColNameValue.clear( );
//		htblColNameValue.put("id", new Integer( 5674567 ));
//		htblColNameValue.put("name", new String("Dalia Noor" ) );
//		htblColNameValue.put("gpa", new Double( 1.25 ) );
//		dbApp.insertIntoTable( strTableName , htblColNameValue );
//
//		htblColNameValue.clear( );
//		htblColNameValue.put("id", new Integer( 23498 ));
//		htblColNameValue.put("name", new String("John Noor" ) );
//		htblColNameValue.put("gpa", new Double( 1.5 ) );
//		dbApp.insertIntoTable( strTableName , htblColNameValue );
//
//		htblColNameValue.clear( );
//		htblColNameValue.put("id", new Integer( 78452 ));
//		htblColNameValue.put("name", new String("Zaky Noor" ) );
//		htblColNameValue.put("gpa", new Double( 0.88 ) );
//		dbApp.insertIntoTable( strTableName , htblColNameValue );
//
//
//		SQLTerm[] arrSQLTerms;
//		arrSQLTerms = new SQLTerm[2];
//		arrSQLTerms[0]._strTableName =  "Student";
//		arrSQLTerms[0]._strColumnName=  "name";
//		arrSQLTerms[0]._strOperator  =  "=";
//		arrSQLTerms[0]._objValue     =  "John Noor";
//
//		arrSQLTerms[1]._strTableName =  "Student";
//		arrSQLTerms[1]._strColumnName=  "gpa";
//		arrSQLTerms[1]._strOperator  =  "=";
//		arrSQLTerms[1]._objValue     =  new Double( 1.5 );
//
//		String[]strarrOperators = new String[1];
//		strarrOperators[0] = "OR";
//		// select * from Student where name = "John Noor" or gpa = 1.5;
//		Iterator resultSet = dbApp.selectFromTable(arrSQLTerms , strarrOperators);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

}