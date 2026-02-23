class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, nums[i]);
            sum = sum + nums[i];
        }
        int low = maxi, high = sum;
        while(low <= high){
            int mid = (low+high)/2;
            int parts = countSubArrays(nums, mid);

            if(parts <= k){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    int countSubArrays(int[] nums, int mid){
        int n = nums.length;
        int sumArray = 0;
        int subArray  = 1;
        
        for(int i=0; i<n; i++){
            if(sumArray + nums[i] <= mid){
                sumArray = sumArray + nums[i];
            }else{
                subArray++;
                sumArray = nums[i];
            }
        }
        return subArray;
    }
}