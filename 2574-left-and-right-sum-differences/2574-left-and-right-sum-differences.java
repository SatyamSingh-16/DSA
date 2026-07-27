class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];

        int ls = nums[0];
        leftsum[0] = 0;
        for(int i = 1;i<n;i++){
            leftsum[i] = ls;
            ls+=nums[i];
        }

        int rs = nums[n-1];
        rightsum[n-1] = 0;
        for(int i = n-2;i>=0;i--){
            rightsum[i] = rs;
            rs+= nums[i];
        }
        int[] answer = new int[n];
        for(int i = 0;i<n;i++){
            answer[i] = Math.abs(leftsum[i]-rightsum[i]);
        }
        return answer;
    }
}