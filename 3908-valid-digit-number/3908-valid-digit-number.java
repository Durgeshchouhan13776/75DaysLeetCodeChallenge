class Solution {
    public boolean validDigit(int n, int x) {
        boolean flag = false;
        int rem = 0;
        while(n>0){
             rem = n%10;
            n/=10;
            if(rem==x){
                flag = true;
            }
        }
        n/=10;
        if(rem==x){
            flag = false;
        }
    return flag;
    }
}