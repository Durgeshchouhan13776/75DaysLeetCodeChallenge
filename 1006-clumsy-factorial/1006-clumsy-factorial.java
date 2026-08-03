class Solution {
    public int clumsy(int n) {
        int n1 = n-1, n2 = n-2;;
        if(n1<=0){
            n1 = 1;
            n2 = 1;
        }
        else if(n2<=0)
{
    n2 = 1;
}        int product = 1, sum = n*n1/n2;
        sum = 2*sum;
    
        while(n>0){
            int a = n;
            int b = n-1;
            int c = n-2;
            int d = n-3;
            if(a<=0){
                a=1;
                b = 1;
                c =1;
                d = 0;
            }
            else if(b<=0){
                b=1;
                c=1;
                d = 0;
            }
            else if(c<=0){
                c = 1;
                d = 0;
            }
            else if(d<=0){
                d=0;
            }
            product = a*b/c;
            sum = sum - product;
            sum = sum+d;

            n-=4;
        
        }
        return sum;
    }
}