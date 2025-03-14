package guru.springframework;

import java.util.Objects;

public class Pair {
    private final String from;
    private final String tp;

    public Pair(String from, String tp) {
        this.from = from;
        this.tp = tp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(from, pair.from) && Objects.equals(tp, pair.tp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, tp);
    }
}
