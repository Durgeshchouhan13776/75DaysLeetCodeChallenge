class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);

        int n = nums.length;
        int min = nums[0];
        int max = nums[n - 1];
      
        for(int num: nums){
            set.add(num);
        }

        for(int i=min; i<max; i++){
            if(!set.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}