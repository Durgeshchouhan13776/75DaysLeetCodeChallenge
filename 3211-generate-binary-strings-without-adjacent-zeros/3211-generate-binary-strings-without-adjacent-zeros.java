class Solution {
    public List<String> validStrings(int n) {
        List<String> ans  = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(n,sb,ans);
        return ans;
    }
    public void backtrack(int n, StringBuilder sb, List<String> ans){
        if(sb.length()==n){
            ans.add(sb.toString());
            return;
        }
        sb.append('1');
        backtrack(n,sb,ans);
        sb.deleteCharAt(sb.length()-1);

        if(sb.length()==0||sb.charAt(sb.length()-1)!='0'){
            sb.append('0');
            backtrack(n, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}