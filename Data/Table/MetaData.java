package Data.Table;

import Data.Handler.FileCreator;
import Data.Table.TableColumn;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MetaData {

    private static String metaPath = "Data_Entry/metadata.csv";
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

        // current sequence of columns that belong to the same table
        ArrayList<TableColumn> currentCols = new ArrayList<>();

        // skip first line
        br.readLine();
        String line = br.readLine();
        while(line != null){
            String[] s = line.split(",");
            // split line on comma and create tableColumn
            TableColumn col = new TableColumn(s[0], s[1], s[2],Boolean.parseBoolean(s[3]),s[4],s[5]);

            // if current column doesn't belong to same table as previous ones
            // then create table and add to list of tables and start new list of columns
            if(!currentCols.isEmpty() && !currentCols.get(0).getTableName().equals(col.getTableName())){
                // Read existing table from .class file
                Table currTable = (Table) FileCreator.readObject(
                        Table.getTableFilePath(currentCols.get(0).getTableName()));
                currTable.setAllColumns(currentCols);
                allTables.add(currTable);
                currentCols = new ArrayList<>();
            }
            currentCols.add(col);
            line = br.readLine();
        }
        Table currTable = (Table) FileCreator.readObject(
                Table.getTableFilePath(currentCols.get(0).getTableName()));
        currTable.setAllColumns(currentCols);
        allTables.add(currTable);

        br.close();
        return allTables;
    }

}
