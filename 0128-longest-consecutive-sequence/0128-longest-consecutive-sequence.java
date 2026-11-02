class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxLength = 1;
        int currentLength = 1;
        if(nums.length <= 0){
            return 0;
        }

        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1] +1){
                currentLength++;
                // maxLength = Math.max(currentLength,maxLength);
            }else if(nums[i] == nums[i-1]){
                continue;
            }else{
                currentLength = 1;
            }
            maxLength = Math.max(currentLength,maxLength);
        }
        return maxLength;
        
    }
}