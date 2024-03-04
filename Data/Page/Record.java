package Data.Page;

import Data.Table.TableColumn;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

public class Record extends Vector<Object>{
    public void insertRecord(Hashtable<Integer , Object> ht) {
        this.setSize(ht.size());
        for(int idx : ht.keySet()){
            this.add(idx , ht.get(idx));
        }
    }


    public void updateRecord(Hashtable<Integer , Object> ht) {
        for(int idx : ht.keySet()){
            this.setElementAt(ht.get(idx), idx);
//            this.remove(idx) ;
//            this.add(idx , ht.get(idx));
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
}
