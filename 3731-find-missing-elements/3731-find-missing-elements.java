class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        int min = nums[0];
        int max = nums[n - 1];
        int i = 0;

        while (min <= max) {
            if (i < n && nums[i] == min) {
                i++;
            } else {
                ls.add(min);
            }
            min++;
        }

        return ls;
    }
}