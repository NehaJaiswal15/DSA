class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> block = new HashMap<>();

        int prefixSum = 0, count = 0;
        int n = nums.length;

        block.put(0, 1);

        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];

            int remove = prefixSum - k;
            if(block.containsKey(remove)) {
                count += block.get(remove);
            }
            block.put(prefixSum, block.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}