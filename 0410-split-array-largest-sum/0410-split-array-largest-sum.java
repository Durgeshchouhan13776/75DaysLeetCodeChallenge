class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
        
        if(k>arr.length){
            return -1;
        }
        int low = Arrays.stream(arr).max().getAsInt();

        int high = Arrays.stream(arr).sum();
        while(low<=high){
            int mid = low+(high-low)/2;
            
            int students = countStudents(arr,mid);
            
            if(students>k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    
    public int countStudents(int[] arr, int pages){
        int students = 1;
        int pagesStudent = 0;
        
        for(int i=0; i<arr.length; i++){
            if(pagesStudent+arr[i]<=pages){
                pagesStudent+=arr[i];
            }
            else{
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }
}