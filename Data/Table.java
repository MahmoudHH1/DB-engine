package Data;

import java.io.*;
import java.util.ArrayList;

import java.io.IOException;
import java.util.Vector;

public class Table implements Serializable {


    Vector<String> pages ; // page paths
    transient ArrayList<TableColumn> allColumns;
    static String tablesDirectory = "Data_Entry/Tables";
    String tablePath ;
    String tableDir;
    String tableName ;
    int pageNum = 1;


    public Table(ArrayList<TableColumn> allColumns) throws IOException {
        tableName = allColumns.get(0).tableName ;
        tableDir = tablesDirectory + File.separator + tableName;
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





    //    public void createPage(Page p) throws IOException {
//        String path = tablePath+pagesPaths.size() +".class"; // need to know number of page to put
//        pagesPaths.add(path);                              // and tableName should belong to Table class not column
//        FileOutputStream fileOut = new FileOutputStream(path);
//        ObjectOutputStream out = new ObjectOutputStream(fileOut);
//        out.writeObject(p);
//        out.close();
//        fileOut.close();
//    }
    public static void main(String[] args) throws IOException {
        ArrayList<TableColumn> cols = new ArrayList<>();
        TableColumn col = new TableColumn("test", "cool", "java.lang.String", true, null, null);
        cols.add(col);
        Table test = new Table(cols);
    }
}