class Solution {

    public int nthMagicalNumber(int n, int a, int b) {

        long l = Math.min(a, b);
        long r = (long) n * Math.min(a, b);
        long ans = 0;
        int mod = 1000000007;

        long lcm = ((long)a*b)/gcd(a,b);

        while (l <= r) {

            long mid = l+ (r - l) / 2;

            long count = mid/a + mid/b - mid/lcm;

            if (count >= n) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return (int) (ans % mod);
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}