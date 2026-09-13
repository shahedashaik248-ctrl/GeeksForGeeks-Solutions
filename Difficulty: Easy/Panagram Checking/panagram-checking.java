class Solution {
    public boolean checkPangram(String s) {
        boolean[] a = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z')
                a[ch - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!a[i])
                return false;
        }

        return true;
    }
}