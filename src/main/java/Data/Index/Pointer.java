package Data.Index;

public class Pointer {
    int pageIdx;
    Object key;
    public Pointer(){
    }

    public Pointer(int pageIdx, Object key) {
        this.pageIdx = pageIdx;
        this.key = key;
    }
}
