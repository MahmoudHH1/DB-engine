package Data.Index;

public class Pointer implements Comparable{
    public int pageIdx;
    public Comparable clusterKey;

    public Pointer(int pageIdx, Object key) {
        this.pageIdx = pageIdx;
        this.clusterKey = (Comparable) key;
    }

    @Override
    public int compareTo(Object o) {
        return this.clusterKey.compareTo(((Pointer)o).clusterKey);
    }

    @Override
    public boolean equals(Object obj) {
        return compareTo(obj) == 0;
    }
}
