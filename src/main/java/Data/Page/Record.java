package Data.Page;

import Data.Index.IndexControler;
import Data.Table.Table;
import Data.Table.TableColumn;
import Exceptions.DBAppException;

import java.io.IOException;
import java.io.Serial;
import java.util.*;
/**
 * Represents a record in a database. Inherits from `Vector<Comparable>` to manage
 * a dynamic and thread safe list of comparable objects (Integer, Double, String).
 */
public class Record extends Vector<Comparable>{
    /**
     * Serial version UID for serialization purposes.
     */
    @Serial
    private static final long serialVersionUID = -9043778273416338053L;

    /**
     * Inserts the values from the Hashtable into the correct
     * indices in a record
     *
     * @param ht A Hashtable containing the data to be inserted into the record.
     */
    public void insertRecord(Hashtable<Integer , Object> ht) {
        this.setSize(ht.size());
        for(int idx : ht.keySet()){
            this.setElementAt((Comparable)ht.get(idx), idx);
        }
    }

    /**
     * Updates a record with new values from Hashtable.
     *
     * @param colIdxVal A Hashtable containing column index, value pairs to be updated.
     * @param colNameVal A Hashtable containing column name, value pairs to be updated.
     * @param clusterKeyVal The value of the cluster key.
     * @param pageIdx The index of the page to be updated.
     * @param table The `Table` object to which the record belongs.
     * @throws DBAppException if there is a database application error.
     * @throws IOException if there is an I/O error.
     * @throws ClassNotFoundException if a class is not found during runtime.
     */
    public void updateRecord(
            Hashtable<Integer, Object> colIdxVal,
            Hashtable<String, Object> colNameVal ,
            Object clusterKeyVal ,
            int pageIdx ,
            Table table
        ) throws DBAppException, IOException, ClassNotFoundException {
        if (colIdxVal.size() != colNameVal.size()) {
            throw new IllegalArgumentException("Hashtable sizes do not match");
        }
        Enumeration<String> colKeys = colNameVal.keys(); // [id , name]
        while (colKeys.hasMoreElements()) {
            String colKey = colKeys.nextElement();
            int idx = table.idxFromName(colKey);
//             check if col has B+ idx
            if(table.isColumnNameBIdx(colKey)){
                // create new HashTable with the onlt this key and this value  ex id : 1 only
                Hashtable <String , Object> toBeUpdated = new Hashtable<>();
                Hashtable <String , Object> newUpdate = new Hashtable<>();
                toBeUpdated.put(colKey , this.get(idx)); // old value
                newUpdate.put(colKey , colNameVal.get(colKey)) ; // new value
                IndexControler.updateIndex(newUpdate, toBeUpdated, clusterKeyVal,pageIdx ,table);
            }
            // Assuming this.setElementAt() method takes an index and a value to update
            this.setElementAt((Comparable) colNameVal.get(colKey), idx);
        }
    }

    /**
     * Returns a string representation of the record, formatted as a CSV-style string.
     *
     * @return A string representing the record, with elements separated by commas.
     */
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
    /**
     * Checks if the values in the hashtable match with ones in the record.
     *
     * @param ht A Hashtable containing the values to check against the record.
     * @return True if the record matches the values, otherwise false.
     */
    public boolean isMatching(Hashtable<Integer, Object> ht){
        for(int idx : ht.keySet()){
            if(!get(idx).equals(ht.get(idx)))
                return false;
        }
        return true;
    }

}
