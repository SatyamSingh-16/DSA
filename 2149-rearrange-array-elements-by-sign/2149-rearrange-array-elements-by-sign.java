class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int i = 0;i<n;i++){
            if(nums[i]>=0){
                positive.add(nums[i]);
            }else{
                negative.add(nums[i]);
            }
        }

        for(int i =0;i<n;i++){
            if(i%2==0){
                nums[i]=positive.get(0);
                positive.remove(0);
            }else{
                nums[i] = negative.get(0);
                negative.remove(0);
            }
        }

        return nums;
    }
}