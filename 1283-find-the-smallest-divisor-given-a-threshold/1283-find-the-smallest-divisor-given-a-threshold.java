class Solution {

    public int sumOfD(int[] nums, int div){
        int sum =0;
        for(int i =0; i<nums.length; i++){
            sum = sum + (int)Math.ceil((double)nums[i]/div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();

        while(low<=high){
            int mid = (low+high)/2;
            if(sumOfD(nums,mid)<=threshold){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}