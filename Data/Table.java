package Data;

import java.io.*;
import java.util.ArrayList;

import java.io.IOException;
import java.util.Vector;

public class Table implements Serializable {


    Vector<String> pages ;
    transient ArrayList<TableColumn>allColumns;
    static String tablesDirectory  = "Data_Entry/Tables";
    String tablePath ;
    String tableName ;
    int pageNum = 1;


    public Table(ArrayList<TableColumn> allColumns) throws IOException {
        tableName = allColumns.get(0).tableName ;
        tablePath = tablesDirectory + File.separator + tableName;
        this.allColumns = allColumns;
        File f = new File(tablePath);
        System.out.println(f.mkdir()?"Table Created" : "Table not Created");
        MetaData.writeDataToMetaDatafile(allColumns);
        tableCreator();
    }

    public void tableCreator() throws IOException {
        tablePath = tablesDirectory + File.separator + tableName + File.separator + "PAGES";
        FileCreator.storeAsObject(this, tablePath );
    }





    //    public void createPage(Page p) throws IOException {
//        String path = tablePath+pagesPathes.size() +".class"; // need to know number of page to put
//        pagesPathes.add(path);                              // and tableName should belong to Table class not column
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
