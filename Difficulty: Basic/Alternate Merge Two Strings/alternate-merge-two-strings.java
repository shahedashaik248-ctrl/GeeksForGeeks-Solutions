class Solution {
public String merge(String s1, String s2) {
String ans = "";
    int i = 0;
    int j = 0;

    while (i < s1.length() || j < s2.length()) {
        if (i < s1.length()) {
            ans += s1.charAt(i);
            i++;
        }

        if (j < s2.length()) {
            ans += s2.charAt(j);
            j++;
        }
    }

    return ans;
}
}
