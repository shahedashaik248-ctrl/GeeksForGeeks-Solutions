import java.util.*;

class Solution {
    public boolean makePalindrome(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr)
            map.put(s, map.getOrDefault(s, 0) + 1);

        int odd = 0;

        for (String s : map.keySet()) {
            String r = new StringBuilder(s).reverse().toString();

            if (!s.equals(r)) {
                if (map.getOrDefault(r, 0) != map.get(s))
                    return false;
            } else {
                if (map.get(s) % 2 == 1)
                    odd++;
            }
        }

        return odd <= 1;
    }
}