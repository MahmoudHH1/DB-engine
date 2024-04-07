package Data.Index;

import java.io.Serial;
import java.io.Serializable;

public class Pointer implements Comparable , Serializable {
    @Serial
    private static final long serialVersionUID = -9043778273416338053L;
    public int pageIdx;
    public Comparable clusterKeyValue;

    public Pointer(int pageIdx, Object key) {
        this.pageIdx = pageIdx;
        this.clusterKeyValue = (Comparable) key;
    }

    @Override
    public int compareTo(Object o) {
        return this.clusterKeyValue.compareTo(((Pointer)o).clusterKeyValue);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pointer)
            return compareTo(obj) == 0;
        return false;
    }

    @Override
    public String toString() {
        return "pageIdx = " + pageIdx + " clustering key = " + clusterKeyValue ;
    }
}
