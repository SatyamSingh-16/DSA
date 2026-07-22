class Solution {
    public boolean isMonotonic(int[] nums) {
        int ca = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                ca++;
            }
        }
        if(ca+1 == nums.length){
            return true;
        }
        ca = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                ca++;
            }
        }
        if(ca+1 == nums.length){
            return true;
        }


        return false;
    }
}