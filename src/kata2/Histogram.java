package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {

    private final int[] DATA;

    public Histogram(int[] data) {
        DATA = data;
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
