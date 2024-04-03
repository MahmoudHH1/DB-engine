package Data.Index;


// this class is just mapping between the DBApp and the BPlusIndex to make the DBApp leaner

import Data.Handler.FileCreator;
import Data.Page.Page;
import Data.Page.Record;
import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.awt.*;
import java.io.File;
import java.io.File;
import java.io.IOException;
import java.util.*;

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
            for (int i = 0 ; i <table.getPagePaths().size(); i++) {
                Page page = (Page) FileCreator.readObject(table.getPagePaths().get(i));
                for(Record record : page){
                    b.insert(record.get(colIdx) , new Pointer(i,record.get((int)table.getClusterKeyAndIndex()[1])));
                }
            }
        }
        b.save();
        return b;
    }

    public static void insertIntoIndex(Record rec , int pageIdx , Table table , Hashtable<String, Object> insertedTuple) throws IOException, ClassNotFoundException, DBAppException {
        Vector<BPlusIndex> allTableIndices = IndexControler.loadAllTableIndices(table.getTableName());
        for (BPlusIndex b : allTableIndices) {
            Enumeration<String> keys = insertedTuple.keys();
            Enumeration<Object> values = insertedTuple.elements();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
                Object value = values.nextElement();
                if (b.getColName().equals(key)) {
                    b.insert(value, new Pointer(pageIdx , rec.get((int)table.getClusterKeyAndIndex()[1])));
                    b.save();
                }
            }
        }
    }

    public static void updatePageIdxOverflow(Record rec , Table table , Hashtable<String, Object> insertedTuple) throws IOException, ClassNotFoundException, DBAppException {
        Vector<BPlusIndex> allTableIndices = IndexControler.loadAllTableIndices(table.getTableName());
        for (BPlusIndex b : allTableIndices) {
            Enumeration<String> keys = insertedTuple.keys();
            Enumeration<Object> values = insertedTuple.elements();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
                Object value = values.nextElement();
                if (b.getColName().equals(key)) {
                    Vector<Pointer> pointers =   b.search(value);
                    for (Pointer p :pointers)
                        if (p.key==rec.get((int)table.getClusterKeyAndIndex()[1]))
                            ++p.pageIdx ;
                    b.save();
                }
            }
        }
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



    public static void updateIndex(Hashtable<String, Object> colVal, Object clusterKeyVal ,Table table) throws IOException, ClassNotFoundException, DBAppException {
//        Set<String> keys = colVal.keySet();
//        String colName = keys.iterator().next();
//        TableColumn col = table.getColumnByName(colName);
//        BPlusIndex idx = readIndexByName(col.getIndexName(), table);
//        Vector<Object> allClusterKeys = idx.search(colVal.get(colName));
//        // get record
//        idx.delete(colVal.get(colName) , clusterKeyVal);
//        idx.insert();
//        if (obj != null) {
//            idx.delete(obj);
//            idx.insert(colVal.get(colName), table.getClusterKey());
//        } else {
//            idx.insert(colVal.get(colName), table.getClusterKey());
//        }
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
