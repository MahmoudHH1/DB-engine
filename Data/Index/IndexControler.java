package Data.Index;


// this class is just mapping between the DBApp and the BPlusIndex to make the DBApp leaner

import Data.Handler.FileCreator;
import Data.Table.Table;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class IndexControler {

    public  static BPlusIndex createIndex(Table table , String strColName , String strIndexName) throws IOException {
        int i = table.getPageNum();
        BPlusIndex b =new BPlusIndex(i*200,table.getTableName(),strColName , strIndexName);
        b.save();
        return b;
    }
    public void insertIntoIndex(){}

    public static void updateIndex(Table table ){

    }

    public void deleteIndex(){}

    public Object searchOnIndex(){return new Object();} // for return the cluster Key value of B+

    public static Vector<BPlusIndex> loadAllTableIndices(String tableName) throws IOException, ClassNotFoundException {
        String directoryPath = "Data_Entry/Tables";
        String finalPath = directoryPath + File.separator + tableName + File.separator + "indices";
        File directory = new File(finalPath);
        Vector<BPlusIndex> allIndices = new Vector<>() ;
        // Check if the specified path is a directory
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            // Check if there are any files in the directory
            if (files != null) {
                for (File file : files) {
                    //-6 de 3shan asheel .class elly ma7tota dy
                    allIndices.add((BPlusIndex) FileCreator.readObject(file.getPath().substring(0,file.getPath().length()-6))) ;
                }
            } else {
                System.out.println("No files found in the directory.");
            }
        } else {
            System.out.println("Specified path is not a directory.");
        }
        return allIndices ;
    }

}
