// class Solution {
//     public int gcdOfOddEvenSums(int n) {
//         int sumOdd=0;
//         int sumEven =0;
//         for(int i=1; i<=2*n; i++){
//             if(i%2==0){
//                 sumEven+=i;
//             }
//             else{
//                 sumOdd+=i;
//             }
//         }
//         for(int i=Math.min(sumEven,sumOdd); i>=1; i--){
//             if((sumEven%i==0)&&(sumOdd%i==0)){
//                 return i;
//             }
//         }
//         return 1;
//     }
// }

class Solution{
    public int gcdOfOddEvenSums(int n){
        int sumOdd=n*n;
        int sumEven=n*(n+1);
        return gcd(sumOdd,sumEven);
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}