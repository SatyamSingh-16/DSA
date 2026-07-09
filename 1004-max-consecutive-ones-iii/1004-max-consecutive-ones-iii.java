class Solution {
    public int longestOnes(int[] nums, int k) {

        int l = 0;
        int zeroC = 0;
        int maxLen = 0;

        for (int r = 0; r < nums.length; r++) {

            if (nums[r] == 0) {
                zeroC++;
            }

            while (zeroC > k) {
                if (nums[l] == 0) {
                    zeroC--;
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}