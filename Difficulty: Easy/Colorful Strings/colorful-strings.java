class Solution {
    public long countStrings(int n, int r, int b, int g) {
        long ans = 0;

        for (int i = r; i <= n; i++) {
            for (int j = b; j <= n - i; j++) {
                int k = n - i - j;

                if (k >= g)
                    ans += fact(n) / (fact(i) * fact(j) * fact(k));
            }
        }

        return ans;
    }

    long fact(int n) {
        long x = 1;

        for (int i = 2; i <= n; i++)
            x *= i;

        return x;
    }
}