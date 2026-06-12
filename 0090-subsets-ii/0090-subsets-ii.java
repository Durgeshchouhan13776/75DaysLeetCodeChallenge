class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        subset(0, nums,new ArrayList<Integer> (), result);
        return result;
    }
    public void subset(int idx, int[] nums,List<Integer> current, List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        //pick
        current.add(nums[idx]);
        subset(idx+1, nums, current,result);

        // Backtrack
        current.remove(current.size() - 1);

        while(idx+1<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }

        // Skip
        subset(idx + 1, nums, current, result);
    }
}