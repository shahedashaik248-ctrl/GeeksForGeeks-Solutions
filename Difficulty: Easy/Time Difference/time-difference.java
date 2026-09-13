class Solution {
    public String timeGap(String st, String et) {
        int h1 = Integer.parseInt(st.substring(0, 2));
        int m1 = Integer.parseInt(st.substring(3, 5));
        int s1 = Integer.parseInt(st.substring(6, 8));

        int h2 = Integer.parseInt(et.substring(0, 2));
        int m2 = Integer.parseInt(et.substring(3, 5));
        int s2 = Integer.parseInt(et.substring(6, 8));

        int a = h1 * 3600 + m1 * 60 + s1;
        int b = h2 * 3600 + m2 * 60 + s2;

        int d = Math.abs(a - b);

        return String.format("%02d:%02d:%02d", d / 3600, (d % 3600) / 60, d % 60);
    }
}