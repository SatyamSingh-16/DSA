class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = weights[0];
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];

            if (weights[i] > max) {
                max = weights[i];
            }
        }

        int l = max;
        int r = sum;

        while(l<=r){
            int mid = (l+r)/2;

            int numberOfDays = daysReq(weights,mid);
            if(numberOfDays <= days){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }

    public int daysReq(int[] weights, int mid){
        int day = 1;
        int load = 0;

        for(int i = 0;i<weights.length;i++){
            if(load + weights[i]>mid){
                day = day + 1;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return day;
    }
}