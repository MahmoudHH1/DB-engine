package Data.Index;

import java.io.Serial;
import java.io.Serializable;
/**
 * Represents a pointer from BPlus index to a page index and cluster key of the table.
 */
public class Pointer implements Comparable , Serializable {
    @Serial
    private static final long serialVersionUID = -9043778273416338053L;
    /** The index of the page where the record is located. */
    public int pageIdx;
    /** The value of the clustering key for the record. */
    public Comparable clusterKeyValue;
    /**
     * Constructs a new Pointer object with the specified page index and clustering key value.
     *
     * @param pageIdx The index of the page where the record is located.
     * @param key     The value of the clustering key for the record.
     */
    public Pointer(int pageIdx, Object key) {
        this.pageIdx = pageIdx;
        this.clusterKeyValue = (Comparable) key;
    }

    @Override
    public int compareTo(Object o) {
        return this.clusterKeyValue.compareTo(((Pointer)o).clusterKeyValue);
    }
    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj The reference object with which to compare.
     * @return true if this Pointer is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pointer)
            return compareTo(obj) == 0;
        return false;
    }
    /**
     * Returns a string representation of this Pointer.
     *
     * @return A string representation of this Pointer, including the page index and clustering key value.
     */
    @Override
    public String toString() {
        return "pageIdx = " + pageIdx + " clustering key = " + clusterKeyValue ;
    }
}
