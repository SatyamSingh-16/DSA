class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums2[j]);
                j++;
            }
        }

        while(i<m){
            arr.add(nums1[i]);
            i++;
        }

        while(j<n){
            arr.add(nums2[j]);
            j++;
        }
        double ans = -1.0;

        int len = arr.size();
        if(len%2==0){
            ans = ((double)arr.get(len/2)+(double)arr.get(len/2 - 1))/2;
        }else{
            ans = arr.get(len/2);
        }

        return (double)ans;
    }
}