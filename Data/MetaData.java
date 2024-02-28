package Data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MetaData {
    static String metaPath = "Data_Entry/metadata.csv";
    public static void writeDataToMetaDatafile( ArrayList<TableColumn> allColumns)
    {
        try {
            FileWriter myWriter = new FileWriter(metaPath , true);
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

}
