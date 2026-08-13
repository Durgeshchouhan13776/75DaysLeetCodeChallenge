class Solution {
    public int missingInteger(int[] prefix) {
        
        int sum=prefix[0];;

        Set<Integer> set = new HashSet<>();
        for(int i=1; i<prefix.length; i++){
            if(prefix[i]==prefix[i-1]+1){
                sum+=prefix[i];
            }
            else{
                break;
            }
        }
        for(int num:prefix){
            set.add(num);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}