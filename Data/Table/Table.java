package Data.Table;

import Data.Handler.FileCreator;

import java.io.*;
import java.util.ArrayList;

import java.io.IOException;
import java.util.Vector;

public class Table implements Serializable {


    private Vector<String> pages ; // page paths
    private transient ArrayList<TableColumn> allColumns;
    static String tablesDirectory = "Data_Entry/Tables";
    private String tablePath ;
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
        tablePath = tableDir +  File.separator + tableName;
        FileCreator.storeAsObject(this, tablePath );
    }

    public ArrayList<TableColumn> getAllColumns() {
        return allColumns;
    }

    public static String getTablesDirectory() {
        return tablesDirectory;
    }

    public String getTablePath() {
        return tablePath;
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
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public void addNewPage(String pagePath){
        this.pages.add(pagePath);
    }

    public static void main(String[] args) throws IOException {
        ArrayList<TableColumn> cols = new ArrayList<>();
        TableColumn col = new TableColumn("test", "cool", "java.lang.String", true, null, null);
        cols.add(col);
        Table test = new Table(cols);
    }
}
