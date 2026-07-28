class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor)
            return 1;

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign = true;
        if (dividend >= 0 && divisor < 0)
            sign = false;
        if (dividend < 0 && divisor > 0)
            sign = false;

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;                    // Changed from int to long

        while (n >= d) {
            int cnt = 0;
            while (n >= (d << (cnt + 1))) {
                cnt++;
            }
            ans += 1L << cnt;            // Use long shift
            n -= d * (1L << cnt);        // Use long shift
        }

        return sign ? (int) ans : (int) -ans;
    }
}