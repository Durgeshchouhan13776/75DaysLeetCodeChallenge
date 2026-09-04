class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int ans = -1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            int min = Integer.MAX_VALUE;
            for(int j=i; j<n; j++){
                if(nums[j]<min){
                    min = nums[j];
                    ans = i;
                }       
            }
            if(max-min<=k) return ans;
        }
        return -1;
    }
}