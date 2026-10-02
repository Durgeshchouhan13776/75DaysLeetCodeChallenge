class Solution {

    public void generate(int n, int l, int r,String s, List<String> ls){
        if(r==n){
            ls.add(s);
        }
        if(l<n)  generate(n, l+1, r, s+"(", ls);
        if(r<l)  generate(n, l, r+1, s+")", ls);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();
        generate(n,0,0,"",ls);
        return ls;
    }
}