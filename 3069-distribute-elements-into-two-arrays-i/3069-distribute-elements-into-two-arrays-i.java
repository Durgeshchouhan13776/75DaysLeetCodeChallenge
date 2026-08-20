class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
       
        int a = nums[0];
        int b= nums[1];
        int c= 1;
        int d = 1;
        arr1[0]=a;
        arr2[0]=b;
        for(int i=2; i<n; i++){
            
            int temp=nums[i];
            if(a>b){
                arr1[c]=temp;
               a = temp;
               c++;
            }
            else{
                arr2[d] = temp;
                b=temp;
                d++;
            }
        }
        for(int i=0; i<d; i++){
            arr1[c] = arr2[i];
            c++;
        }
        return arr1;
    }
}