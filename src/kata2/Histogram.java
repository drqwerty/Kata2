package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {

    private final int[] DATA = {1, 1, 1, 100, 2, 4, 5, 6, 8, 8, 4, 5, 6, 2, -4};

    public Histogram() {
    }

    public int[] getDATA() {
        return DATA;
    }

    public Map<Integer, Integer> getHistogram() {
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int value : DATA) {
            histogram.put(value, histogram.containsKey(value) ? histogram.get(value) + 1 : 1);
        }
        return histogram;
    }
}