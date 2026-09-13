class Solution {
    public int searchCharacter(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                return i;
        }
        return -1;
    }
}