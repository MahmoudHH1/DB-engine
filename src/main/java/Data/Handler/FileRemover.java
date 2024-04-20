package Data.Handler;

import Data.Table.Table;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The FileRemover class provides methods to remove directories and files from the system.
 */
public class FileRemover {

    private static final String tablesDirectory = "Data_Entry/Tables";

    /**
     * Removes a directory and its contents recursively.
     *
     * @param directoryName The name of the directory to remove.
     */
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

    /**
     * Removes a page from the directory and updates the associated table.
     *
     * @param table    The table associated with the file.
     * @param pagePath The path of the file to be removed.
     */
    public static void removePageFromTable(Table table, String pagePath) {
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

    /**
     * removes page from table's directory without affecting array.
     *
     * @param pagePath the path of the page to be deleted
     */
    public static void removeFileFromDirectory(String pagePath) {
        Path filePath = Paths.get(pagePath + ".class");
        try {
            if (Files.exists(filePath)) {
                Files.delete(filePath);
                System.out.println("File removed: " + pagePath + ".class");
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
