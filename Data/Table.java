package Data;

import java.io.*;
import java.util.ArrayList;

import java.io.IOException;

public class Table implements Serializable {
    ArrayList<String> pagesPathes ;


    ArrayList<TableColumn>allColumns;

    public Table(ArrayList<TableColumn> allColumns) {
        this.allColumns = allColumns;
        writeDataToMetaDatafile("D:\\Coding\\DataBase\\Database_projects\\Database_Engine Project\\Database-Engine\\Data_Entry\\metadata.csv" , allColumns);
    }


    public static void writeDataToMetaDatafile(String filePath , ArrayList<TableColumn>allColumns)
    {
        try {
            FileWriter myWriter = new FileWriter(filePath , true);
            for(TableColumn column : allColumns){
                myWriter.append(column.toString());
            }
            myWriter.close();
            System.out.println("Successfully wrote to the Metadata file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
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
