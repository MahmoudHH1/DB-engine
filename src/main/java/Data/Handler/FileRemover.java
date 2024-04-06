package Data.Handler;

import Data.Table.MetaData;
import Data.Table.Table;
import Exceptions.DBAppException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRemover {

    private static final String tablesDirectory = "Data_Entry/Tables" ;

    public static void removeDirectory(String directoryName) {
        Path directoryPath = Paths.get(tablesDirectory, directoryName);
        try {
            if (Files.exists(directoryPath)) {
                Files.walk(directoryPath)
                        .sorted(java.util.Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(java.io.File::delete);
            } else {
                System.out.println("Directory does not exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeFileFromDirectory(Table table, String pagePath) {
        //looping through the given table only not all directories in the tables directory
//        String path = tablesDirectory + File.separator + tableName ;
//        fileName = fileName + ".class" ;
        Path filePath = Paths.get(pagePath + ".class");
        try {
            if (Files.exists(filePath)) {
                Files.delete(filePath);
                System.out.println("File removed: " + pagePath + ".class");
                //remove the page from page paths
                table.removePageFromArr(pagePath);
                table.save();
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
