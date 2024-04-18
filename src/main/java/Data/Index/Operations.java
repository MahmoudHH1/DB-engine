package Data.Index;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
/**
 * Provides static methods for set operations on vectors of Pointers.
 */

public class Operations {
    /**
     * Computes the intersection of two vectors of Pointers.
     *
     * @param a The first vector of Pointers.
     * @param b The second vector of Pointers.
     * @return A vector containing the common Pointers between vector a and vector b.
     */
    public static Vector<Pointer> intersect(Vector<Pointer> a, Vector<Pointer> b){
        a.retainAll(b);
        return a;
    }

    /**
     * Computes the union of two vectors of Pointers.
     *
     * @param a The first vector of Pointers.
     * @param b The second vector of Pointers.
     * @return A vector containing all unique Pointers from both vector a and vector b.
     */
    public static Vector<Pointer> union(Vector<Pointer> a, Vector<Pointer> b){
        Set<Pointer> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);
        return new Vector<>(set);
    }

    /**
     * Computes the exclusive OR (XOR) of two vectors of Pointers.
     *
     * @param a The first vector of Pointers.
     * @param b The second vector of Pointers.
     * @return A vector containing Pointers that are exclusive to either vector a or vector b.
     */
    public static Vector<Pointer> xor(Vector<Pointer> a, Vector<Pointer> b){
        Set<Pointer> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);
        a.retainAll(b);
        a.forEach(set::remove);
        return new Vector<>(set);
    }
}
