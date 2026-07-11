class Solution {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int x : nums) {
            if (x != 0)
                arr.add(x);
        }

        int i = 0;

        for (; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}