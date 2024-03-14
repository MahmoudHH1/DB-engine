package Data.Page;

import Data.Index.IndexControler;
import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import java.io.IOException;
import java.util.*;

public class Record extends Vector<Comparable>{
    public void insertRecord(Hashtable<Integer , Object> ht) {
        this.setSize(ht.size());
        for(int idx : ht.keySet()){
            this.setElementAt((Comparable)ht.get(idx), idx);
        }
    }


    public void updateRecord(
            Hashtable<Integer, Object> ht,
            Hashtable<String, Object> colVal ,
            Table table
        ) throws DBAppException, IOException, ClassNotFoundException {
        if (ht.size() != colVal.size()) {
            throw new IllegalArgumentException("Hashtable sizes do not match");
        }
        Enumeration<Integer> indexKeys = ht.keys();
        Enumeration<String> colKeys = colVal.keys(); // [id , name]
        System.out.println("Size of Index value ht : "+  ht.size());
        System.out.println("Size of col value ht : "+  colVal.size());
        while (indexKeys.hasMoreElements() && colKeys.hasMoreElements()) {
            int idx = indexKeys.nextElement();
            String colKey = colKeys.nextElement();
            // check if col has B+ idx
//            if(table.isColumnNameBIdx(colKey)){
//                // create new HashTable with the onlt this key and this value  ex id : 1 only
//                Hashtable <String , Object> toUpdate = new Hashtable<>();
//                toUpdate.put(colKey , colVal.get(colKey));
//                IndexControler.updateIndex(toUpdate,table);
//            }
            // Assuming this.setElementAt() method takes an index and a value to update
            this.setElementAt((Comparable) colVal.get(colKey), idx);
        }
    }


    @Override
    public synchronized String toString() {
        StringBuilder record = new StringBuilder();
        record.append('"');
        for (Object o : this) {
            record.append(o.toString());
            record.append(',');
        }
        if (record.length() > 1) {
            record.deleteCharAt(record.length() - 1);
        }
        record.append('"');
        return record.toString();
    }
    public boolean isMatching(Hashtable<Integer, Object> ht){
        for(int idx : ht.keySet()){
            if(!get(idx).equals(ht.get(idx)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }

//    @Override public int compareTo(Student comparestu) {
//        int compareage
//                = ((Student)comparestu).getStudentage();
//
//        //  For Ascending order
//        return this.studentage - compareage;
//
//    }

}
