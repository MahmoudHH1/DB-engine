package Data.Page;

import Data.Table.TableColumn;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class Record extends Vector<Hashtable<Object, String >> {
    @Override
    public synchronized String toString() {
        StringBuilder record = new StringBuilder();
        record.append('"');
        for (Hashtable<Object, String> hashtable : this) {
            for (String value : hashtable.values()) {
                record.append(value);
                record.append(',');
            }
        }
        record.deleteCharAt(record.length()-1);
        record.append('"');
        return record.toString() ;
    }

    public static void main(String[] args) {

    }
}
