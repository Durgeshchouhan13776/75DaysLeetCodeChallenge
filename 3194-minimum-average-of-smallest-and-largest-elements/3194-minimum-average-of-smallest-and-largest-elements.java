class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int l=0,r=n-1;
        double maxlen=Integer.MAX_VALUE;
        while(l<n){
            double avg = (nums[l]+nums[r])/2.0;
            maxlen = Math.min(maxlen,avg);
            l++;
            r--;
        }
        return maxlen;
    }
}