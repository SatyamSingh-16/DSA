class Solution {
    public int splitArray(int[] nums, int k) {

        int maxEle = Integer.MIN_VALUE;
        for (int num : nums) {
            maxEle = Math.max(maxEle, num);
        }

        int l = maxEle;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int r = sum;
        int ans = sum;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (canSplit(nums, k, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public boolean canSplit(int[] nums, int k, int mid) {

        int csum = 0;
        int count = 1;

        for (int i = 0; i < nums.length; i++) {

            if (csum + nums[i] <= mid) {
                csum += nums[i];
            } else {
                count++;
                csum = nums[i];

                if (count > k) {
                    return false;
                }
            }
        }

        return true;
    }
}