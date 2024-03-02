package Data.Table;

import Data.Handler.FileCreator;
import Data.Page.Page;
import Data.Page.Record;
import Exceptions.DBAppException;

import java.io.*;
import java.util.ArrayList;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;


public class Table implements Serializable {

    private static final long serialVersionUID = -9043778273416338053L;
    private Vector<Page> pages ; // page paths

    public Vector<String> getPagePaths() {
        return pagePaths;
    }

    private Vector<String> pagePaths ; // page paths
    private transient ArrayList<TableColumn> allColumns;
    static String tablesDirectory = "Data_Entry/Tables";
    private String tableFilePath ;
    private String tableDir;
    private String tableName ;
    private int pageNum = 1;


    public Table(ArrayList<TableColumn> allColumns) throws IOException {
        this.pages = new Vector<>() ;
        this.tableName = allColumns.get(0).getTableName() ;
        this.tableDir = tablesDirectory + File.separator + tableName;
        this.allColumns = allColumns;
        File f = new File(tableDir);
        System.out.println(f.mkdir()?"Table Created" : "Table not Created");
        MetaData.writeDataToMetaDatafile(allColumns);
        tableCreator();
    }

    public void tableCreator() throws IOException {
        tableFilePath = tableDir +  File.separator + tableName;
        FileCreator.storeAsObject(this, tableFilePath );
    }

    public ArrayList<TableColumn> getAllColumns() {
        return allColumns;
    }

    public static String getTablesDirectory() {
        return tablesDirectory;
    }

    public String getTableFilePath() {
        return tableFilePath;
    }
    public String getTableDir() {
        return tableDir;
    }
    public String getTableName() {
        return tableName;
    }
    public int getPageNum() {
        return pageNum;
    }
    public Vector<Page> getAllPages(){return pages ;}
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public void addNewPage(Page newPage){
        this.pages.add(newPage);
    }
    public void setPages(Vector<Page> pages) {
        this.pages = pages;
    }
    public void setAllColumns(ArrayList<TableColumn> allColumns) {
        this.allColumns = allColumns;
    }
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public static String getTableFilePath(String name){
        return tablesDirectory + File.separator +
                name + File.separator + name;
    }

    public static Table getTable(ArrayList<Table> allTables , String tableName) throws DBAppException {
        for(Table table : allTables){
            if (table.tableName.equals(tableName)){
                return table ;
            }
        }
        throw new DBAppException("Table not found");
    }

    public Object[] getClusterKeyAndIndex() throws DBAppException {
        for (int i = 0; i < allColumns.size(); i++) {
            if(allColumns.get(i).isClusterKey()){
                return new Object[]{allColumns.get(i) , i};
            }
        }
        throw new DBAppException("No cluster Key for this Table");
    }
    public Hashtable<Integer, Object> getColIdxVal(Hashtable<String, Object> ht) throws DBAppException {
        Hashtable<Integer, Object> res = new Hashtable<>();
        for(String key: ht.keySet()){
            res.put(idxFromName(key), ht.get(key));
        }
        return res;
    }
    public int idxFromName(String name) throws DBAppException {
        for(int i =0 ; i<getAllColumns().size(); i++){
            if(getAllColumns().get(i).equals(name)){
                return i;
            }
        }
        throw new DBAppException("Invalid Column Name: " + name);
    }
    // skeleton method for searching for records O(n)
    // To be modified later
    public ArrayList<Record> searchFor(Hashtable<Integer, Object> colIdxVal) throws IOException, ClassNotFoundException, DBAppException {
        for(String path: getPagePaths()){
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
        throw new DBAppException("Not implemented yet"); // do not use method yet
    }

    @Override
    public boolean equals(Object o){
        // two tables are equal if they have the same name
        // to be revisited
        if(o instanceof Table){
            return this.tableName.equals(((Table) o).tableName);
        }
        if(o instanceof String){
            return tableName.equals(o);
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<TableColumn> cols = new ArrayList<>();
        TableColumn col = new TableColumn("test", "cool", "java.lang.String", true, null, null);
        cols.add(col);
        Table test = new Table(cols);
    }
}
