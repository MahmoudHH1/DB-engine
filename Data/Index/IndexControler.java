package Data.Index;


// this class is just mapping between the DBApp and the BPlusIndex to make the DBApp leaner

import Data.Handler.FileCreator;
import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.io.File;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

public class IndexControler {

    public static BPlusIndex createIndex(Table table, String strColName, String strIndexName) throws IOException {
        int i = table.getPageNum();
        BPlusIndex b = new BPlusIndex(i * 200, table.getTableName(), strColName, strIndexName);
        b.save();
        return b;
    }

    public void insertIntoIndex() {
    }

    public static void updateIndex(Hashtable<String, Object> colVal, Table table) throws IOException, ClassNotFoundException, DBAppException {
        // get idx by idxName readIdx(name , table)
        // search for value(Key) in hashTable in this idx
        // if exist remove it
        // insert new value to this idx
        Set<String> keys = colVal.keySet();
        // get colname (only The Key) in the colVal
        String colName = keys.iterator().next();
        TableColumn col = table.getColumnByName(colName);
        BPlusIndex idx = readIndexByName(col.getIndexName(), table);
        // search for cluser key first from all retuned values (Because may have dublicates)
        ArrayList<Object> allClusterKeys = idx.search(colVal.get(colName)); //key in b+ == value in colVal
        Object obj = new Object();
        for (Object cluserKey : allClusterKeys) {
            if (cluserKey.equals(table.getClusterKey())) {
//                obj = ;
                // get key this key from B+ (value of colVal) and send it to delete function
                // delete -> should be modified to make it take key and value(cluserKey)
                // to ensure that it deletes the correct key from B+
            }
        }
        // key already exist
        if (obj != null) {
            idx.delete(obj);
            idx.insert(colVal.get(colName), table.getClusterKey());
        } else { // key dne should not happen
            idx.insert(colVal.get(colName), table.getClusterKey());
        }
    }

    ;

    public Object searchOnIndex() {
        return new Object();
    } // for return the cluster Key value of B+

    public static Vector<BPlusIndex> loadAllTableIndices(String tableName) throws IOException, ClassNotFoundException {
        try {
            String directoryPath = "Data_Entry" + File.separator + "Tables";
            String finalPath = directoryPath + File.separator + tableName + File.separator + "Indices";
            File directory = new File(finalPath);
            Vector<BPlusIndex> allIndices = new Vector<>();
            // Check if the specified path is a directory
            if (directory.isDirectory()) {
                File[] files = directory.listFiles();

                // Check if there are any files in the directory
                if (files != null) {
                    for (File file : files) {
                        //-6 de 3shan asheel .class elly ma7tota dy
                        String idxPath = file.getPath().substring(0, file.getPath().length() - 6) ;
                        BPlusIndex idx= (BPlusIndex) FileCreator.readObject(idxPath) ;
                        allIndices.add(idx);
                    }
                } else {
                    System.out.println("No files found in the directory.");
                }
            } else {
                System.out.println("Specified path is not a directory.");
            }
            return allIndices;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Vector<>() ;
    }


    public static BPlusIndex readIndexByName(String idxName, Table table) throws IOException, ClassNotFoundException {
        String idxPath = "Data_Entry" +
                File.separator +
                "Tables" +
                File.separator +
                table.getTableName() +
                File.separator +
                "Indices" +
                File.separator +
                idxName;
        return (BPlusIndex) FileCreator.readObject(idxPath);
    }
}
