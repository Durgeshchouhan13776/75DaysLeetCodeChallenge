class Solution {
    public int smallestIndex(int[] nums) {
        int ans = -1;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            int n = nums[i];
            while(n>0){
                int rem  = n%10;
                sum+=rem;
                n/=10;
            }
            if(sum==i){
                ans = i;
                break;
            }
        }
        return ans;
    }
}