package Data.Index;


// this class is just mapping between the DBApp and the BPlusIndex to make the DBApp leaner

import Data.Handler.FileCreator;
import Data.Page.Page;
import Data.Page.Record;
import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class IndexControler {

    public static BPlusIndex createIndex(Table table, String strColName, String strIndexName) throws IOException, ClassNotFoundException, DBAppException {

        BPlusIndex b = new BPlusIndex(10, table.getTableName(), strColName, strIndexName);
        // if col has records already
        if (table.hasRecords()) {
            // load all pages
            // for each record
            // get idxCol index -> getcolIdx()
            // insert values at this index into b+ idx
            int colIdx = table.idxFromName(strColName);
            for (int i = 0; i < table.getPagePaths().size(); i++) {
                Page page = Page.readPage(table.getPagePaths().get(i), table);
                for (Record record : page) {
                    b.insert(record.get(colIdx), new Pointer(i, record.get((int) table.getClusterKeyAndIndex()[1])));
                }
            }
        }
        b.save();
        return b;
    }

    public static void insertIntoIndex(Record rec, int pageIdx, Table table, Hashtable<String, Object> insertedTuple) throws IOException, ClassNotFoundException, DBAppException {
        Vector<BPlusIndex> allTableIndices = IndexControler.loadAllTableIndices(table.getTableName());
        for (BPlusIndex b : allTableIndices) {
            Enumeration<String> keys = insertedTuple.keys();
            Enumeration<Object> values = insertedTuple.elements();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
                Object value = values.nextElement();
                if (b.getColName().equals(key)) {
                    b.insert(value, new Pointer(pageIdx, rec.get((int) table.getClusterKeyAndIndex()[1])));
                    b.save();
                }
            }
        }
    }

    public static void updatePageIdxOverflow(Record rec, Table table) throws IOException, ClassNotFoundException, DBAppException {
        Vector<BPlusIndex> allTableIndices = IndexControler.loadAllTableIndices(table.getTableName());
        for (BPlusIndex b : allTableIndices) {
            int i = table.idxFromName(b.getColName());
            Comparable<?> clusteringKey = rec.get((int)table.getClusterKeyAndIndex()[1]) ;
            //getting all the pointers to the value of the coulumn
            Vector<Pointer> pointers = b.search(rec.get(i)) ;
            for (Pointer p : pointers){
                if (p.clusterKeyValue.equals(clusteringKey)){
                    b.delete(rec.get(i),p);
                    b.insert(rec.get(i),new Pointer(p.pageIdx+1,clusteringKey));
                    //break l 3yon ConcurrentModificationException
                    break ;
                }
            }
            b.save();
        }
    }

    //    public static void updatePageIdxOverflow(Record rec , Table table , Hashtable<String, Object> insertedTuple) throws IOException, ClassNotFoundException, DBAppException {
//        Vector<BPlusIndex> allTableIndices = IndexControler.loadAllTableIndices(table.getTableName());
//        for (BPlusIndex b : allTableIndices) {
//            Enumeration<String> keys = insertedTuple.keys();
//            Enumeration<Object> values = insertedTuple.elements();
//            while (keys.hasMoreElements()) {
//                String key = keys.nextElement();
//                Object value = values.nextElement();
//                Comparable clusteringKey = rec.get((int)table.getClusterKeyAndIndex()[1]);
//                if (b.getColName().equals(clusteringKey)) {
//                    Vector<Pointer> pointers =   b.search(value);
//                    for (Pointer p :pointers){
//                        if (p.clusterKeyValue==clusteringKey){
//                            ++p.pageIdx ;
////                            Object comlumnToModify = rec.get(table.idxFromName(b.getColName()));
////                            System.out.println((String)comlumnToModify + "  " + p.pageIdx );
////                            b.delete(comlumnToModify,p);
////                            b.insert(comlumnToModify,new Pointer(p.pageIdx+1,clusteringKey));
//                            b.save();
//                        }
//                    }
//                }
//            }
//        }
//    }
    public static void deleteFromIndex(ArrayList<Integer> colIdxWBplus, ArrayList<BPlusIndex> affectedBPlus, ArrayList<Record> toRemove, ArrayList<Pointer> ptrsToRemove) {
        for (int currCol : colIdxWBplus) {
            // bplus tree of current column
            BPlusIndex currBplus = affectedBPlus.get(currCol);
            for (int j = 0; j < toRemove.size(); j++) {
                Object key = toRemove.get(j).get(currCol);
                Pointer p = ptrsToRemove.get(j);
                currBplus.delete(key, p);
            }
        }
    }

    /**
        update({id : 1 , age : 20},{id : 2 , age :30},{id : 3 , age :20})
        [1,3] [2]     // values
    *   [20]  [30]   // keys
    *   searchIdx(key = 20)-> return  [1,3]
    *   delete (20 ,1 )
    *   [3] [2]     // values
    *   [20]  [30]   // keys
    * */
    public static void updateIndex(
            Hashtable<String, Object> newColNameVal, // name in old and new is same
            Hashtable<String, Object> oldColNameVal,
            Object clusterKeyVal,
            int pageIdx,
            Table table
    ) throws IOException, ClassNotFoundException, DBAppException {

        String colName = oldColNameVal.keySet().iterator().next();
        TableColumn col = table.getColumnByName(colName);
        if (col.getIndexName().equals("null")) {
            throw new DBAppException("There is no index for : " + col.getColumnName() + " column");
        }
        BPlusIndex idx = readIndexByName(col.getIndexName(), table);

        Object oldValue = oldColNameVal.get(colName);
        Vector<Pointer> pageIdxsAndClusterKeysValues = idx.search(oldValue); // [{0 , clusterKeyval1 } ,{1 ,clusterKeyval2}]
        Pointer oldPointer = null;
        if (pageIdxsAndClusterKeysValues == null) {
            throw new DBAppException("Old value : " + oldValue + " to be updated not found in the index");
        }
        for (Pointer pointer : pageIdxsAndClusterKeysValues) {
            if (pointer.clusterKeyValue.compareTo(clusterKeyVal) == 0) {
                oldPointer = pointer;
            }
        }
        if (oldPointer != null) {
            idx.delete(oldColNameVal.get(colName), oldPointer);
            idx.insert(newColNameVal.get(colName), new Pointer(pageIdx, clusterKeyVal)); // insert new Pointer (pageIdx , cluter Keyval)
            idx.save();
        } else {
            throw new DBAppException("This column has no B+ index to update it");
        }

    }

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
                        String idxPath = file.getPath().substring(0, file.getPath().length() - 6);
                        BPlusIndex idx = (BPlusIndex) FileCreator.readObject(idxPath);
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
        return new Vector<>();
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

    public static Vector<Pointer> search(Table table, String colName, Object value, String operator) throws DBAppException, IOException, ClassNotFoundException {
        BPlusIndex bplus = readIndexByName(table.getColumnByName(colName).getIndexName(), table);
        return switch (operator) {
            case "=" -> bplus.search(value);
            case "!=" -> Operations.union(bplus.searchExclusive(value, true), bplus.searchExclusive(value, false));
            case ">" -> bplus.searchExclusive(value, false);
            case ">=" -> bplus.searchInclusive(value, false);
            case "<" -> bplus.searchExclusive(value, true);
            case "<=" -> bplus.searchInclusive(value, true);
            default -> throw new DBAppException("Unsupported operator");
        };

    }
    public static Vector<Pointer> searchIntersect(Table table, ArrayList<Integer> colIdxWBplus,
                                                  Hashtable<Integer, Object> colIdxVal,
                                                  ArrayList<BPlusIndex> affectedBPlus)
            throws IOException, ClassNotFoundException {
        Vector<Pointer> bplusFilter = null;
        for (int i : colIdxWBplus) {
            TableColumn col = table.getAllColumns().get(i);
            BPlusIndex bplus = IndexControler.readIndexByName(col.getIndexName(), table);
            affectedBPlus.add(bplus);
            // search for queried value
            if(colIdxVal.get(i) != null){
                Vector<Pointer> pointers = bplus.search(colIdxVal.get(i));
                if (bplusFilter == null)
                    bplusFilter = pointers;
                else
                    Operations.intersect(bplusFilter, pointers);
            }
        }
        return bplusFilter;
    }
    public static boolean testIndexTable(Table table) throws IOException, ClassNotFoundException, DBAppException {
        int clusterIdx =(int) table.getClusterKeyAndIndex()[1];
        ArrayList<TableColumn> cols = table.getAllColumnBIdxs();

        for(int i = 0; i< table.getPagePaths().size(); i++){
            Page page = Page.readPage(table.getPagePaths().get(i), table);

            for(Record record : page){
                for(TableColumn col : cols){
                    BPlusIndex currBP = readIndexByName(col.getIndexName(), table);
                    Object key = record.get(table.idxFromName(col.getColumnName()));
                    Vector<Pointer> ptrs = currBP.search(key);
                    int check = ptrs.indexOf(new Pointer(i, record.get(clusterIdx)));
                    if(ptrs.get(check).pageIdx != i){
                        System.out.println("incorrect pageIdx in bplus for key: " + record.get(clusterIdx));
                        System.out.println("supposed to be: " + i + " but found " + ptrs.get(check).pageIdx);
                        return false;
                    }

                }
            }
        }
        return true;
    }
    public static void updatePageDeletion(ArrayList<BPlusIndex> bPlusIndices, int deletedIdx) {
        for(BPlusIndex bplus: bPlusIndices) {
            BPlusIndex.LeafNode curr = bplus.firstLeaf;
            while (curr != null) {
                for (BPlusIndex.DictionaryPair dp : curr.dictionary) {
                    if (dp == null) break;
                    for (Pointer p : dp.values)
                        if (p.pageIdx >= deletedIdx)
                            p.pageIdx--;
                }
                curr = curr.rightSibling;
            }
        }
    }


}
