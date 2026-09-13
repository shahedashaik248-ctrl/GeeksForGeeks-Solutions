import java.util.*;

class Solution {
    public String maximumFrequency(String s) {
        String[] a = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String x : a)
            map.put(x, map.getOrDefault(x, 0) + 1);

        String ans = "";
        int max = 0;

        for (String x : a) {
            if (map.get(x) > max) {
                max = map.get(x);
                ans = x;
            }
        }

        return ans + " " + max;
    }
}