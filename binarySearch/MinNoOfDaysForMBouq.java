class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if (n < (long)m * k) return -1;

        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int low = mini, high = maxi;

        while(low<= high){
            int mid = (low+high)/2;
            if(possible(bloomDay, mid, m, k) == true){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    boolean possible(int[] bloomDay, int mid, int m, int k){
        int count = 0;
        int noOfB = 0;
        int n = bloomDay.length;

        for(int i=0; i<n; i++){
            if(bloomDay[i] <= mid){
                count++;
            }else{
                noOfB += (count/k);
                count = 0;
            }
        }
        noOfB += (count/k);
        if(noOfB >= m) return true;
        else{
            return false;
        }

    }
}