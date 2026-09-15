class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,maxlen=0;
        int n = s.length();
        int[] hash = new int[256];
        while(r<n){
            hash[s.charAt(r)]++;
            while(hash[s.charAt(r)]>1){
                hash[s.charAt(l)]--;
                l++;
            }
            
                maxlen = Math.max(maxlen,r-l+1);
        
            r++;
        }
        return maxlen;
    }
}