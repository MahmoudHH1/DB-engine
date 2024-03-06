package Data.Page;

import Data.Table.TableColumn;

import java.util.*;

public class Record extends Vector<Comparable>{
    public void insertRecord(Hashtable<Integer , Object> ht) {
        this.setSize(ht.size());
        for(int idx : ht.keySet()){
            this.add(idx , (Comparable) ht.get(idx));
        }
    }


    public void updateRecord(Hashtable<Integer , Object> ht) {
        for(int idx : ht.keySet()){
            this.setElementAt((Comparable)ht.get(idx), idx);
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
