class Solution {
    public List<List<String>> partition(String s) {
        List<String> ls  = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        backtrack(s,0,ls,ans);
        return ans;
    }
    public void backtrack(String s, int idx, List<String> ls, List<List<String>> ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=idx; i<s.length(); i++){
            String sub = s.substring(idx,i+1);
            if(isPalindrome(sub)){
                ls.add(sub);
                backtrack(s,i+1,ls,ans);
                ls.remove(ls.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String str){
        int l = 0;
        int r = str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}