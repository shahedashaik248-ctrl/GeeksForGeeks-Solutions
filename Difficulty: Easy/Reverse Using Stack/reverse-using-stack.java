class Solution {
    public String reverse(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }

        String ans = "";

        while (!st.empty()) {
            ans += st.pop();
        }

        return ans;
    }
}