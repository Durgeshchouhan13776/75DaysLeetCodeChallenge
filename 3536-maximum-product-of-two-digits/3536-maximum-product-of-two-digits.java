class Solution {
    public int maxProduct(int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        while(n>0){
            int digit = n%10;
            if(max1<digit){
                max2 = max1;
                max1 = digit;
            }
           else if(max2<digit){
                max2 = digit;
            }
            n/=10;
        }
        return max1*max2;
    }
}