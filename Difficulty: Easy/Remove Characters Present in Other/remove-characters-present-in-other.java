class Solution {
    public String removeChars(String s1, String s2) {
        String ans = "";

        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) == -1)
                ans += s1.charAt(i);
        }

        return ans;
    }
}