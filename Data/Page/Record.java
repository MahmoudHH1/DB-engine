package Data.Page;

import Data.Table.TableColumn;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

public class Record extends Hashtable<Object, String >{
    @Override
    public synchronized String toString() {
        StringBuilder record = new StringBuilder();
        record.append('"');
        for (Map.Entry<Object, String> entry : entrySet()) {
            String value = entry.getValue();
            record.append(value);
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
