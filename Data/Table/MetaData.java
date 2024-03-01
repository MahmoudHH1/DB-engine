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

}
