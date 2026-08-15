class pair implements Comparable<pair> {

    String s;
    int freq;

    pair(String s, int freq) {
        this.s= s;
        this.freq = freq;
    }

    public int compareTo(pair p) {
        if(this.freq!=p.freq) {
            return this.freq - p.freq;
            }
        return p.s.compareTo(this.s);
    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        

        HashMap<String,Integer> hm = new HashMap<>();

        for(String s : words){
            hm.put(s, hm.getOrDefault(s,0)+1);
        }

        PriorityQueue<pair> pq = new PriorityQueue<>();

        for(String str : hm.keySet()){
            int freq = hm.get(str);
            pq.add(new pair(str,freq));
            if(pq.size()>k) pq.remove();
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<k; i++){
            pair p = pq.remove();
            ans.add(p.s);
        }
        Collections.reverse(ans);
        return ans;
    }
}