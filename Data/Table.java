package Data;

import java.io.*;
import java.util.ArrayList;

import java.io.IOException;

public class Table implements Serializable {
    ArrayList<String> pagesPathes ;


    ArrayList<TableColumn>allColumns;

    public Table(ArrayList<TableColumn> allColumns) {
        this.allColumns = allColumns;
        MetaData.writeDataToMetaDatafile(allColumns);
    }

    public void storePage(Page p) throws IOException {
        // In Progress !!!!!!!!!!
        String path = allColumns.get(0).tableName + pagesPathes.size() +".class"; // need to know number of page to put
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
