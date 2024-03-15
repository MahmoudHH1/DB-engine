package Data.Index;


// this class is just mapping between the DBApp and the BPlusIndex to make the DBApp leaner

import Data.Handler.FileCreator;
import Data.Page.Page;
import Data.Page.Record;
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

    public static BPlusIndex createIndex(Table table, String strColName, String strIndexName) throws IOException, ClassNotFoundException, DBAppException {
        int i = table.getPageNum();
        BPlusIndex b = new BPlusIndex(i * 200, table.getTableName(), strColName, strIndexName);
        // if col has records already
        if(table.hasRecords()){
            // load all pages
            // for each record
            // get idxCol index -> getcolIdx()
            // insert values at this index into b+ idx
            int colIdx = table.idxFromName(strColName);
            for (String path : table.getPagePaths()) {
                Page page = (Page) FileCreator.readObject(path);
                for(Record record : page){
                    b.insert(record.get(colIdx) , table.getClusterKey());
                }
            }
        }
        b.save();
        return b;
    }

    public void insertIntoIndex() {
    }

    public static void updateIndex(Hashtable<String, Object> colVal, Table table) throws IOException, ClassNotFoundException, DBAppException {
        Set<String> keys = colVal.keySet();
        String colName = keys.iterator().next();
        TableColumn col = table.getColumnByName(colName);
        BPlusIndex idx = readIndexByName(col.getIndexName(), table);
        Vector<Object> allClusterKeys = idx.search(colVal.get(colName));
        Object obj = new Object();
        for (Object cluserKey : allClusterKeys) {
            if (cluserKey.equals(table.getClusterKey())) {

            }
        }
        if (obj != null) {
            idx.delete(obj);
            idx.insert(colVal.get(colName), table.getClusterKey());
        } else {
            idx.insert(colVal.get(colName), table.getClusterKey());
        }
    }

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
