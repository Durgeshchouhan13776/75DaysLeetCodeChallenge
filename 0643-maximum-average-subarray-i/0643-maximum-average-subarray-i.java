class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r=0;
        int n = nums.length;
        int len = 0;
        double Sum =0;
    double maxSum=Double.NEGATIVE_INFINITY;
    while(r<n){
        Sum+=nums[r];
        len++;
       if(len==k){
        maxSum=Math.max(Sum,maxSum);
       }
       if(len>k){
        Sum -= nums[l];
        l++;
        len--;
        maxSum=Math.max(Sum,maxSum);
       }
       r++;
    }
    return maxSum/k;
    }
}