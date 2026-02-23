class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, weights[i]);
            sum = sum + weights[i]; 
        }
        int low = maxi, high = sum;
        while(low <= high){
            int mid = (low+high)/2;
            int noOfDays = f(weights, mid);

            if(noOfDays <= days){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    int f(int[] weights, int mid){
        int days = 1, load = 0;
        int n = weights.length;
        for(int i=0; i<n; i++){
            if(load + weights[i] > mid){
                days = days + 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }
}