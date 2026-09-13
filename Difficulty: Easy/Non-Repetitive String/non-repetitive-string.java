class Solution {
    public boolean nonRepetitive(String s) {
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i > 0 && ch != s.charAt(i - 1)) {
                if (seen[ch - 'A'])
                    return false;
            }

            seen[ch - 'A'] = true;
        }

        return true;
    }
}