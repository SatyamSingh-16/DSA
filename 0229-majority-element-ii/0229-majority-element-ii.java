class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        int div = nums.length / 3;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > div ){
                arr.add(entry.getKey());
            }
        }

        return arr;
    }
}