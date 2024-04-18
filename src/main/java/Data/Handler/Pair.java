package Data.Handler;

import java.io.Serial;
import java.io.Serializable;

public class Pair<K,T> implements Serializable {
    @Serial
    private static final long serialVersionUID = -9043778273416338053L;
    public K x;
    public T y;

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
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
