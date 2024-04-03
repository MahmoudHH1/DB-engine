package Data.Index;


// this class is just mapping between the DBApp and the BPlusIndex to make the DBApp leaner

import Data.Handler.FileCreator;
import Data.Page.Page;
import Data.Page.Record;
import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import javax.print.attribute.HashPrintJobAttributeSet;
import javax.swing.*;
import java.io.File;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

public class IndexControler {

    public static BPlusIndex createIndex(Table table, String strColName, String strIndexName) throws IOException, ClassNotFoundException, DBAppException {

        BPlusIndex b = new BPlusIndex(10, table.getTableName(), strColName, strIndexName);
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

    /*
        update({id : 1 , age : 20},{id : 2 , age :30},{id : 3 , age :20})
        [1,3] [2]     // values
    *   [20]  [30]   // keys
    *   searchIdx(key = 20)-> return  [1,3]
    *   delete (20 ,1 )
    *   [3] [2]     // values
    *   [20]  [30]   // keys
    *
    *
    * */



    public static void updateIndex(
            Hashtable<String, Object> newColNameVal, // name in old and new is same
            Hashtable<String, Object> oldColNameVal,
            Object clusterKeyVal ,
            int pageIdx ,
            Table table
        ) throws IOException, ClassNotFoundException, DBAppException {


        String colName = oldColNameVal.keySet().iterator().next();
        TableColumn col = table.getColumnByName(colName);
        BPlusIndex idx = readIndexByName(col.getIndexName(), table);

        Object oldValue = oldColNameVal.get(colName) ;
        Vector<Pointer> pageIdxsAndClusterKeysValues = idx.search(oldValue); // [{0 , clusterKeyval1 } ,{1 ,clusterKeyval2}]
        Pointer oldPointer = null ;
        for(Pointer pointer : pageIdxsAndClusterKeysValues){
            if(pointer.key.compareTo(clusterKeyVal) == 0){
                oldPointer =pointer ;
            }
        }
        if (oldPointer != null) {
            idx.delete(oldColNameVal.get(colName) , oldPointer);
            idx.insert(newColNameVal.get(colName),new Pointer( pageIdx , clusterKeyVal) ); // insert new Pointer (pageIdx , cluter Keyval)
        }else{
            throw new DBAppException("This column has no B+ index");
        }
    }

    public Object searchOnIndex() {
        return new Object();
    } // for return the cluster Key value of B+

    public static Vector<BPlusIndex> loadAllTableIndices(String tableName) throws IOException, ClassNotFoundException {
        String directoryPath = "Data_Entry/Tables";
        String finalPath = directoryPath + File.separator + tableName + File.separator + "indices";
        File directory = new File(finalPath);
        Vector<BPlusIndex> allIndices = new Vector<>();
        // Check if the specified path is a directory
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            // Check if there are any files in the directory
            if (files != null) {
                for (File file : files) {
                    //-6 de 3shan asheel .class elly ma7tota dy
                    allIndices.add((BPlusIndex) FileCreator.readObject(file.getPath().substring(0, file.getPath().length() - 6)));
                }
            } else {
                System.out.println("No files found in the directory.");
            }
        } else {
            System.out.println("Specified path is not a directory.");
        }
        return allIndices;
    }


    public static BPlusIndex readIndexByName(String idxName, Table table) throws IOException, ClassNotFoundException {
        String idxPath = "Data_Entry" +
                File.separator +
                "Tables" +
                File.separator +
                table.getTableName() +
                File.separator +
                "indices" +
                File.separator +
                idxName;
        return (BPlusIndex) FileCreator.readObject(idxPath);
    }

}
