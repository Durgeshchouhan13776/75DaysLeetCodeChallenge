class Solution {
    public int subsetXORSum(int[] nums) {
       return subset(0, nums, 0);
    }
    public int subset(int idx, int[] nums, int xor){
        if(idx==nums.length){
            return xor;
        }
 
        int take = subset(idx+1, nums, xor^nums[idx]);

        int notTake = subset(idx+1, nums, xor);

        return take+notTake;
    }
}