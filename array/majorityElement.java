class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int c = 0;
        for(int i =0; i<n; i++){
            if(count == 0){
                c = nums[i];
            }
            if(nums[i] == c){
                count++;
            }else{
                count--;
            }
        }
        return c;
    }
}