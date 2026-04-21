import java.util.Arrays;

class Solution {
    
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

   public static void merge(int[] A, int low, int high, int mid){
        int[] B = new int[high+1];
        int i = low;
        int j = mid+1;
        int k = low;

        while (i <= mid && j <= high)
    {
        if (A[i] < A[j])
        {
            B[k] = A[i];
            i++;
            k++;
        }
        else
        {
            B[k] = A[j];
            j++;
            k++;
        }
    }
    while (i <= mid)
    {
        B[k] = A[i];
        k++;
        i++;
    }
    while (j <= high)
    {
        B[k] = A[j];
        k++;
        j++;
    }
    for (int z= low; z<= high; z++)
    {
        A[z] = B[z];
    }
}
    public static void mergeSort(int[] A, int low, int high){
        int mid;
        if(low<high){
            mid = (low+high)/2;
            mergeSort(A, low, mid);
            mergeSort(A, mid+1, high);
            merge(A, low, high, mid);
        }
    }
}