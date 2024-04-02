package Data.Index;

public class Pointer implements Comparable{
    int pageIdx;
    Comparable key;

    public Pointer(int pageIdx, Object key) {
        this.pageIdx = pageIdx;
        this.key = (Comparable) key;
    }

    @Override
    public int compareTo(Object o) {
        return this.key.compareTo(((Pointer)o).key);
    }
}
