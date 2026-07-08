class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
            max = piles[i];
            }
        }

        int l = 1;
        int r = max;
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r)/2;
            int totalH = totalHours(piles,mid);
            if(totalH <= h){
                ans = mid;
                r = mid -1;
            }else{
                l = mid+1;
            }
        }

        return ans;


    }

    public int totalHours(int[] piles, int hour){
        int totalH = 0;
        for(int i = 0;i<piles.length;i++){
            totalH += Math.ceil((double)piles[i] / hour);
        }

        return totalH;
    }
}