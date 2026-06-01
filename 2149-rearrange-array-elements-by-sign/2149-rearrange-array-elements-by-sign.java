class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n/2];
        int[] arr2 = new int[n/2];
        int[] ans = new int[n];
        int i=0;
        int l1=0, l2 =0;
        while(i<n){
            if(nums[i]>0){
                arr1[l1] = nums[i];
                i++;
                l1++;
            }
            else{
                arr2[l2] = nums[i];
                i++;
                l2++;
            }
        }
        l1=0;
        l2=0;
        i=0;
        while(i<n){
            ans[i]=arr1[l1];
            i++;
            l1++;
            ans[i]=arr2[l2];
            i++;
            l2++;
        }
        return ans;
    }
}