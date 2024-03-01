package Data.Table;

import Data.Handler.FileCreator;
import Data.Table.TableColumn;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class MetaData {

    private static final String metaPath = "Data_Entry/metadata.csv";
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
    public static ArrayList<Table> loadAllTables() throws IOException, ClassNotFoundException {
        // prepare csv for reading

        BufferedReader br = new BufferedReader(new FileReader(metaPath));
        ArrayList<Table> allTables = new ArrayList<>();
        ArrayList<TableColumn> currentCols = new ArrayList<>();
        br.readLine(); // skip first line
        String line = br.readLine();

        while(line != null) {
            String[] s = line.split(",");
            TableColumn col = new TableColumn(s[0], s[1], s[2], Boolean.parseBoolean(s[3]), s[4], s[5]);

            if (!currentCols.isEmpty() && !currentCols.get(0).getTableName().equals(col.getTableName())) {
                Table currTable = (Table) FileCreator.readObject(Table.getTableFilePath(currentCols.get(0).getTableName()));
                currTable.setAllColumns(currentCols);
                allTables.add(currTable);
                currentCols = new ArrayList<>();
            }

            currentCols.add(col);
            line = br.readLine();
        }

        // Load the last table
        if (!currentCols.isEmpty()) {
            Table currTable = (Table) FileCreator.readObject(Table.getTableFilePath(currentCols.get(0).getTableName()));
            currTable.setAllColumns(currentCols);
            allTables.add(currTable);
        }

        br.close();
        return allTables;
    }

    //reading the metadata file to know the columns of each table to check it when trying to insert new record
    public static Hashtable<String, Object> processMetadataFile(String filePath, String tableName) {
        Hashtable<String, Object> result = new Hashtable<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into elements
                String[] elements = line.split(",");

                // Check if the first element matches the given string 'x'
                if (elements.length >= 3 && elements[0].equals(tableName)) {
                    // If the condition is met, add a tuple to the result hashtable
                    String columnName = elements[1];
                    String columnType = elements[2];
                    result.put(columnName, columnType);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }



}
