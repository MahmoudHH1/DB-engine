package Data.Index;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Operations {
    public static Vector<Pointer> intersect(Vector<Pointer> a, Vector<Pointer> b){
        a.retainAll(b);
        return a;
    }
    public static Vector<Pointer> union(Vector<Pointer> a, Vector<Pointer> b){
        Set<Pointer> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);
        return new Vector<>(set);
    }
    public static Vector<Pointer> xor(Vector<Pointer> a, Vector<Pointer> b){
        Set<Pointer> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);
        a.retainAll(b);
        a.forEach(set::remove);
        return new Vector<>(set);
    }
}
