class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : bloomDay) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        int l = min;
        int r = max;
        if ((long)m * k > bloomDay.length) {
            return -1;
        }

        while(l<=r){
            int mid = (l+r)/2;
            if(found(bloomDay,m,k,mid)){
                r = mid-1;
            }else{
                l = mid + 1;
            }
        }

        return l;
    }

    public boolean found(int[] bloomDay,int m, int k,int mid){
        int count = 0;
        int totalBon = 0;

        for(int i = 0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }else{
                totalBon += count/k;
                count = 0;
            }
        }

        totalBon +=count/k;
        return totalBon>=m;
    }
}