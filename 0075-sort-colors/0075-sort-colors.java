class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] freq = new int[3];
        for(int i = 0;i<n;i++){
            int index = nums[i];
            freq[index]++;
        }

        int k = 0;
        for(int i = 0;i<freq.length;i++){
            int l = freq[i];
            for(int m = 0;m<l;m++){
                nums[k] = i;
                k++;
            }
        }

    }
}