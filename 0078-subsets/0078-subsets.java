class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subset(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void subset(int idx, int[] nums, List<Integer> current,
                        List<List<Integer>> result) {

        if (idx == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Pick
        current.add(nums[idx]);
        subset(idx + 1, nums, current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Skip
        subset(idx + 1, nums, current, result);
    }
}