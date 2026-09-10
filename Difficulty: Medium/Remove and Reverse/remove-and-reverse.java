class Solution {
    public String removeReverse(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        char[] a = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;
        int flag = 0;

        while (left <= right) {
            if (flag == 0) {
                char ch = a[left];

                if (freq[ch - 'a'] == 1) {
                    left++;
                }
                else {
                    freq[ch - 'a']--;
                    a[left] = '#';
                    left++;
                    flag = 1;
                }
            }
            else {
                char ch = a[right];

                if (freq[ch - 'a'] == 1) {
                    right--;
                }
                else {
                    freq[ch - 'a']--;
                    a[right] = '#';
                    right--;
                    flag = 0;
                }
            }
        }

        String ans = "";

        if (flag == 1) {
            for (int i = a.length - 1; i >= 0; i--) {
                if (a[i] != '#') {
                    ans += a[i];
                }
            }
        }
        else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != '#') {
                    ans += a[i];
                }
            }
        }

        return ans;
    }
}