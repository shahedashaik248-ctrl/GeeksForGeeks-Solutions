class Solution {
    public String reducedString(String s) {
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            st.append(s.charAt(i));

            int n = st.length();

            if (n >= 3 &&
                st.charAt(n - 1) == st.charAt(n - 2) &&
                st.charAt(n - 2) == st.charAt(n - 3)) {

                st.delete(n - 3, n);
            }
        }

        return st.length() == 0 ? "-1" : st.toString();
    }
}