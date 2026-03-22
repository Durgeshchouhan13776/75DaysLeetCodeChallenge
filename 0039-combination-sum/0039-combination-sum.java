class Solution {
    public static void findCombinations(int idx, int[] arr, int target,List<List<Integer>> ans, List<Integer> ls){
        if(idx == arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(arr[idx]<=target){
            ls.add(arr[idx]);
            findCombinations(idx, arr, target-arr[idx], ans, ls);
            ls.remove(ls.size()-1);
        }
        findCombinations(idx+1, arr, target,ans, ls);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        findCombinations(0,candidates,target,ans,ls);
        return ans;
    }
}