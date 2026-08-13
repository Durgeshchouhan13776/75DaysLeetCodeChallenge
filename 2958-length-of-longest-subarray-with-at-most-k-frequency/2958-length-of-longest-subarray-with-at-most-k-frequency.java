class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int r=0,l=0;
        int maxlen=0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        while(r<nums.length){
           freq.put(nums[r],freq.getOrDefault(nums[r],0)+1);
           while(freq.get(nums[r])>k){
            freq.put(nums[l],freq.get(nums[l])-1);
            l++;
           }
           maxlen = Math.max(maxlen,r-l+1);
           r++;
        }
        return maxlen;
    }
}