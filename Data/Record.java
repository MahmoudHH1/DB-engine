package Data;

import java.util.Vector;

public class Record extends Vector<Object> {
    @Override
    public synchronized String toString() {
        StringBuilder record = new StringBuilder();
        record.append('"');
        for(Object o : this) {
            record.append(o.toString());
            record.append(',');
        }
        record.deleteCharAt(record.length()-1);
        record.append('"');
        return record.toString() ;
    }

    public static void main(String[] args) {
        Record r = new Record() ;
        r.add("ID");
        r.add("Name");
        r.add("Age");
        r.add("Gender");
        System.out.println(r);
    }
}
