class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long  val = (long)m*k;
        if(val>bloomDay.length) return -1;


        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans=high;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(possible(bloomDay,mid,m,k)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public boolean possible(int[] bloomDay,int day, int m, int k){
        int count=0;
        int NoOfBouquet=0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                NoOfBouquet += (count/k);
                count=0;
            }
        }
        NoOfBouquet+=(count/k);
        if(NoOfBouquet >= m){
            return true;
        }
        else{
            return false;
        }
    }
}