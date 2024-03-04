package Data.Table;

import Data.Handler.FileCreator;
import Data.Table.TableColumn;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

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

    public static void updateOnMetaDataFile(
            String tableNameToModify,
            String columnNameToModify,
            String newIndexName) {
        try {
            // Read existing metadata from the file
            BufferedReader reader = new BufferedReader(new FileReader(metaPath));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                String [] a = line.split(",") ;
                if (a[0].equals(tableNameToModify) && a[1].equals(columnNameToModify)){
                    a[4] = newIndexName ;
                    a[5] = "B+ Tree" ;
                    line =convertArrStr(a , ",");
                }
                sb.append(line).append(System.lineSeparator());
            }
            reader.close();
            String metaDataContent = sb.toString();
            FileWriter writer = new FileWriter(metaPath);
            writer.write(metaDataContent); // Write existing data
            writer.close();

            System.out.println("Successfully modified the Metadata file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private static String convertArrStr(String[] strArr, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr)
            sb.append(str).append(delimiter);
        return sb.substring(0, sb.length() - 1);
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
            while(line != null && s.length <6){
                s = line.split(",");
                line = br.readLine();
                if(line == null)
                    break;
            }
            if(line == null)
                break;
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



//    public static void main(String[] args){
//        Hashtable<String,Object> htblColNameValue = new Hashtable<>();
//        htblColNameValue.put("id", new Integer( 2343432 ));
//        htblColNameValue.put("name", new String("Ahmed Noor" ) );
//        htblColNameValue.put("gpa", new Double( 0.95 ) );
//        System.out.println(IsValidTuple("Student" , htblColNameValue)) ;
//
//    }



}
