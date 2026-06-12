class Solution {
    
    public void recurePermute(int idx, int[] nums, List<List<Integer>> ans){
        if(idx==nums.length){
            List<Integer> ds = new ArrayList<>();

            for(int i=0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
        }
        for(int i =idx; i<nums.length; i++){
            swap(i, idx,nums);
            recurePermute(idx+1, nums, ans);
            swap(i, idx, nums);
        }
    }
     private void swap(int i, int idx, int[] nums){
            int t = nums[i];
            nums[i] = nums[idx];
            nums[idx] = t;
        }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurePermute(0,nums,ans);
        return ans;
    }
}