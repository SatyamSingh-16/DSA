class Solution {
    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        int[] cntPrefix = new int[n + 1];
        int nonZero = 0;
        for (int i = 0; i < n; i++) {
            cntPrefix[i + 1] = cntPrefix[i];
            if (s.charAt(i) != '0') {
                cntPrefix[i + 1]++;
                nonZero++;
            }
        }

        long[] pow10 = new long[nonZero + 1];
        pow10[0] = 1;
        for (int i = 1; i <= nonZero; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        long[] prefVal = new long[nonZero + 1];
        int[] prefSum = new int[nonZero + 1];

        int idx = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != '0') {
                int d = c - '0';
                prefVal[idx + 1] = (prefVal[idx] * 10 + d) % MOD;
                prefSum[idx + 1] = prefSum[idx] + d;
                idx++;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int left = cntPrefix[l];
            int right = cntPrefix[r + 1] - 1;

            if (left > right) {
                ans[i] = 0;
                continue;
            }

            int len = right - left + 1;

            long x = (prefVal[right + 1]
                    - (prefVal[left] * pow10[len]) % MOD
                    + MOD) % MOD;

            long sum = prefSum[right + 1] - prefSum[left];

            ans[i] = (int) ((x * sum) % MOD);
        }

        return ans;
    }
}