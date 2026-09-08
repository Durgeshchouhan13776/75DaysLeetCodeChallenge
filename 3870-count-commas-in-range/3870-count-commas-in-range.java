class Solution {
    public int countCommas(int n) {
        int count = 0;
        while(n>=1000){
            if(n>=1000000){
                n--;
                count+=2;
            }
            else{
                count++;
                n--;
            }
        }
        return count;
    }
}