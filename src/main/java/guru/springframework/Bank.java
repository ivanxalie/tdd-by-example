package guru.springframework;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<Pair, Integer> rates = new HashMap<>();

    public Money reduce(Expression source, String currency) {
        return source.reduce(this, currency);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }
}
