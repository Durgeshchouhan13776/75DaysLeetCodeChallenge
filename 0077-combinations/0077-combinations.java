class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(1,ans,ls,n,k);
        return ls;
    }
    public void backtrack(int start,List<Integer> ans,List<List<Integer>> ls,int n, int k){
        if(ans.size()==k){
            ls.add(new ArrayList<>(ans));
            return;
        }

        for(int i=start; i<=n; i++){
            ans.add(i);
            backtrack(i+1,ans,ls,n,k);
            ans.remove(ans.size()-1);
        }
    }
}