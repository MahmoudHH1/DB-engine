package Data.Index;

import java.io.Serializable;

public class Pointer implements Comparable , Serializable {
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
        return compareTo(obj) == 0;
    }
}
