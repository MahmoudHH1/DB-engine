


import Data.Handler.FileCreator;
import Data.Page.Page;
import Data.Page.Record;
import Data.Table.MetaData;
import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Hashtable;


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
                            String strClusteringKeyValue,
                            Hashtable<String, Object> htblColNameValue) throws DBAppException, IOException {
        Table tabel = Table.getTable(allTables, strTableName);
        Object clusterKeyVal = strClusteringKeyValue ;
        Object[]clusterKeyColIndex = (tabel.getClusterKeyAndIndex()) ;
        switch ( ((TableColumn)clusterKeyColIndex[0]).getColumnType() ){
            case "java.lang.double" :
                clusterKeyVal = Double.parseDouble(strClusteringKeyValue); break;
            case "java.lang.Integer" :
                clusterKeyVal = Integer.parseInt(strClusteringKeyValue); break;
        }
        outerLoop:
        // to exit all loops
        for (Page page : tabel.getAllPages()) {
            for (int i = 0; i <page.getAllRecords().size() ; i++) {
                if (page.getAllRecords().get(((Integer) clusterKeyColIndex[1])).equals(clusterKeyVal)) {

                    break outerLoop;
                }
            }
        }
    }


    // following method could be used to delete one or more rows.
    // htblColNameValue holds the key and value. This will be used in search
    // to identify which rows/tuples to delete.
    // htblColNameValue enteries are ANDED together
    public void deleteFromTable(String strTableName,
                                Hashtable<String, Object> htblColNameValue) throws DBAppException, IOException, ClassNotFoundException {
        Table table = null;
        int rowsAffected = 0;
        // find table
        for(Table t: allTables){
            if(t.equals(strTableName)){
                table = t;
                break;
            }
        }
        if(table == null)
            throw new DBAppException("Table " + strTableName + " not found");
        // map column name to idx
        Hashtable<Integer, Object> colIdxVal = table.getColIdxVal(htblColNameValue);
        for(String path: table.getPagePaths()){
            // still need to adjust for index
            Page page = (Page) FileCreator.readObject(path);
            ArrayList<Record> toRemove = new ArrayList<>();
            for(Record record: page.getAllRecords()){
                boolean matching = record.isMatching(colIdxVal);
                if(matching)
                    toRemove.add(record);
            }
            page.getAllRecords().removeAll(toRemove);
        }


    }


    public Iterator selectFromTable(SQLTerm[] arrSQLTerms,
                                    String[] strarrOperators) throws DBAppException {
            // habiba will do this
            // habiba on master now
        return null;
    }


    public static void main(String[] args) {
        try {
            String strTableName = "Student";
            DBApp dbApp = new DBApp();
//            Table tabel = Table.getTable(dbApp.allTables, strTableName);
//            System.out.println(tabel.getAllPages().get(1).getAllRecords());
            Hashtable htblColNameType = new Hashtable( );
            htblColNameType.put("name", "java.lang.String");
            htblColNameType.put("gpa", "java.lang.double");
            htblColNameType.put("id", "java.lang.Integer");
            dbApp.createTable(strTableName, "id", htblColNameType);
//            dbApp.insertIntoTable("samaloty", new Hashtable<>());
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