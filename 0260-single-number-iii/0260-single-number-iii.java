class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()== 1) {
                arr.add(entry.getKey());
            }   
        }
        int[] ans = new int[arr.size()];
        for(int i = 0;i<arr.size();i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}