class Solution {
    String removeDuplicates(String s) {
        boolean[] a = new boolean[256];
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!a[ch]) {
                ans += ch;
                a[ch] = true;
            }
        }

        return ans;
    }
}