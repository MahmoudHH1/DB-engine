package Data;

import java.io.Serializable;
import java.util.ArrayList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Table implements Serializable {
    ArrayList<String>pagesPathes ;

    ArrayList<TableColumn>allColumns;

    public Table(ArrayList<TableColumn> allColumns) {
        this.allColumns = allColumns;
        MetaData.writeDataToMetaDatafile(allColumns);
    }



    public static void main(String[] args) {

    }
}
