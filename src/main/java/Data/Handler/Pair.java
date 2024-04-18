package Data.Handler;

import java.io.Serial;
import java.io.Serializable;

/**
 * Represents a generic pair of two values.
 *
 * @param <K> the type of the first value in the pair
 * @param <T> the type of the second value in the pair
 */
public class Pair<K, T>implements Serializable {
    @Serial
    private static final long serialVersionUID = -9043778273416338053L;
    /**
     * The first value of the pair.
     */
    public K x;

    /**
     * The second value of the pair.
     */
    public T y;

    /**
     * Constructs a new Pair instance with default values for its elements.
     *
     * <p>The default values for x and y are null.
     */
    public Pair() {
    }

    /**
     * Constructs a new Pair instance with the specified values for its elements.
     *
     * @param x the first value of the pair
     * @param y the second value of the pair
     */
    public Pair(K x, T y) {
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

