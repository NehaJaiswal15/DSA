class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMaxEl(piles);

        while(low <= high){
            int mid = (low+high)/2;
            int totalHrs = calTotalHrs(piles, mid);

            if(totalHrs <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
    return low;
    }

    int calTotalHrs(int[] piles, int h){
        int totalHrs = 0;

        for(int i=0; i<piles.length; i++){
            totalHrs += Math.ceil((double) piles[i] / (double) h);
        }
        return totalHrs;
    }
    int findMaxEl(int[] piles){
        int maxi =0;
        for(int i=0; i<piles.length; i++){
            maxi = Math.max(maxi, piles[i]);
        }
        return maxi;
    }
}