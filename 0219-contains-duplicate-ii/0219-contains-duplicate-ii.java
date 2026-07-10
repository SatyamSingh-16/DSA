class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int r = 0;r<nums.length;r++){
            if(!map.containsKey(nums[r])){
                map.put(nums[r],r);
            }else{
                int val = Math.abs(r-map.get(nums[r]));
                if(val <= k){
                    return true;
                }
                map.put(nums[r],r);
            }

        }

        return false;
    }
}