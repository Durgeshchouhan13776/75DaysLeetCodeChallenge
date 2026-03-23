class Solution {

    static void findcombinations(int idx, int[] arr, int target, List<Integer> st, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList(st));
            return;
        }

        for(int i = idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            st.add(arr[i]);
            findcombinations(i+1, arr, target-arr[i], st, ans);
            st.remove(st.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> st = new ArrayList<>();
        findcombinations(0,candidates,target, st, ans);
        return ans;
    }
}