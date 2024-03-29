package Data.Handler;

public class Pair<K,T> {
    public K x;
    public T y;
    public int max;

    // pair
    public Pair() {
    }
    public Pair(K x, T y) {
        this.x = x;
        this.y = y;
    }

    public Pair(K x, T y, int max) {
        this.x = x;
        this.y = y;
        this.max = max;
    }
}
