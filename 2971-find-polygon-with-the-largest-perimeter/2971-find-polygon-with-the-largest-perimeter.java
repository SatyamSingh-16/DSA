class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        long total = 0;
        for (int num : nums) {
            total += num;
        }

        for (int i = nums.length - 1; i >= 2; i--) {
            if (total - nums[i] > nums[i]) {
                return total;
            }
            total -= nums[i];
        }

        return -1;
    }
}