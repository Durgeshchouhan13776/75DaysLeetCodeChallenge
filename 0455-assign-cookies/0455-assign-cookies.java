class Solution {
    //submit kr dena
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length, n = s.length;
        int l = 0, r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<n && r<m){
            if(g[r]<=s[l]){
                r++;
            }
            l++;
        }
        return r;
    }
}