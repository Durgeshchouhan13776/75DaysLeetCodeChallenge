class Solution {

    public void func(int idx,int sum, List<List<Integer>> ls,int k, int n, List<Integer> ans ){
        if(sum==n && ans.size()==k){
            ls.add(new ArrayList<>(ans));
            return;
        }
        if(idx>9||sum>n||ans.size()>k){
            return;
        }

        //pick
        ans.add(idx);
        func(idx+1, sum+idx, ls, k, n,ans);

        //backtrack
        ans.remove(ans.size()-1);

        //not pick
        func(idx+1, sum, ls, k,n,ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        func(1,0,ls,k,n, ans);
        return ls;
    }
}