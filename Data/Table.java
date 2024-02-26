package Data;

import java.io.*;
import java.util.ArrayList;

import java.io.IOException;

public class Table implements Serializable {
    ArrayList<String> pagesPathes ;
    ArrayList<TableColumn>allColumns;
    String tableDirectory  = "Data_Entry/Tables";
    String tablePath ;
    String tableName ;


    public Table(ArrayList<TableColumn> allColumns) {
        this.allColumns = allColumns;
        MetaData.writeDataToMetaDatafile(allColumns);
        tableName = allColumns.get(0).tableName ;
        tablePath = tableDirectory+'/'+tableName;
        File f = new File(tablePath);
        System.out.println(f.mkdir());
    }



    public void createPage(Page p) throws IOException {
        String path = tablePath+pagesPathes.size() +".class"; // need to know number of page to put
        pagesPathes.add(path);                              // and tableName should belong to Table class not column
        FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(p);
        out.close();
        fileOut.close();
    }
    public static void main(String[] args) {

    }
}
