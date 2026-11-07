class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        permute (nums,ls,ans,vis);
        return ans;
    }
    public void permute(int[] nums, List<Integer> ls, List<List<Integer>> ans,boolean[] vis ){
        if(nums.length==ls.size()){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1] && !vis[i-1]){
                continue;
            }
            if(!vis[i]){
                ls.add(nums[i]);
                vis[i] = true;
                permute (nums,ls,ans,vis);
                ls.remove(ls.size()-1);
                vis[i] = false;
            }
        }
    }
}