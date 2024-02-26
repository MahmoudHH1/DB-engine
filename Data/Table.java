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



    public static void main(String[] args) {

    }
}
