class pair implements Comparable<pair>{
    int ele;
    int freq;

    pair(int ele, int freq){
        this.ele = ele;
        this.freq = freq;
    }
    
    public int compareTo(pair p){
        return this.freq - p.freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>();

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num: nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        for(int ele: hm.keySet()){
            int freq = hm.get(ele);
            pq.add(new pair(ele,freq));
            if(pq.size()>k) pq.remove();
        }

        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            pair top = pq.remove();

            ans[i] = top.ele;

        }
        return ans;
    }
}