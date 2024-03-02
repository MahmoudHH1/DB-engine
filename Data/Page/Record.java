package Data.Page;

import Data.Table.TableColumn;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

public class Record extends Vector<Object>{
//    public void updateRecord(int columnName, Object newValue) {
//        if (columnExists(columnName)) {
//            this.remove(columnName); // Remove old value
//            this.put(columnName, newValue); // Update with new value
//        } else {
//            throw new IllegalArgumentException("Column " + columnName + " does not exist in this record.");
//        }
//    }
//    private boolean columnExists(String columnName) {
//        return this.containsKey(columnName);
//    }

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

    public static void main(String[] args) {

    }
}
