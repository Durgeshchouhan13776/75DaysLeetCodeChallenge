class Solution {
    public int characterReplacement(String s, int k) {
        int r=0,l=0,maxlen=0,maxf=0;
        int[] hash=new int[26];
        while(r<s.length()){
            int charidx=s.charAt(r)-'A';
            hash[charidx]++;
            maxf=Math.max(maxf,hash[charidx]);
            while((r-l+1)-maxf>k){
                int leftidx=s.charAt(l)-'A';
                hash[leftidx]--;
                maxf=0;
                l++;
                for(int i=0; i<25; i++){
                    maxf=Math.max(maxf,hash[i]);
                }
            }
            if((r-l+1)-maxf<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}