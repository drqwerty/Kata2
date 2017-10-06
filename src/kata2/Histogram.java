package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {

    private final T[] DATA;

    public Histogram(T[] data) {
        DATA = data;
    }

    public T[] getDATA() {
        return DATA;
    }

    public Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<>();
        for (T value : DATA) {
            histogram.put(value, histogram.containsKey(value) ? histogram.get(value) + 1 : 1);
        }
        return histogram;
    }
}
