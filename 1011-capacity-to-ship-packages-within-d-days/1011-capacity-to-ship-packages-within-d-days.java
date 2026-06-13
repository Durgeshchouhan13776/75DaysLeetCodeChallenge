class Solution {

    public int findDays(int[] weights, int capa){
        int days = 1, load = 0;

        for(int i =0; i<weights.length; i++){
            if(weights[i]+load>capa){
                days++;
                load = weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while(low<=high){
            int mid = (low+high)/2;

          int  noOfDays = findDays(weights,mid);
            if(noOfDays<=days){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}