package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {

        Histogram histo = new Histogram();
        Map<Integer, Integer> histogr = histo.getHistogram();

        for (int key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
}