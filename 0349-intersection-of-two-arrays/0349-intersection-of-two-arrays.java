class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();

        if(set1.size()>set2.size()){
            for(int num: set1){
                if(set2.contains(num)){
                    arr.add(num);
                }
            }
        }else{
            for(int num: set2){
                if(set1.contains(num)){
                    arr.add(num);
                }
            }
        }
        int[] ans = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        return ans;

    }
}