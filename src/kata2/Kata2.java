package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        
        Histogram histo = new Histogram(new int[]{1, 1, 1, 100, 2, 4, 5, 6, 8, 8, 4, 5, 6, 2, -4});
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (int key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
}
