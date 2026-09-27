class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(List<String> item : knowledge ){
            hm.put(item.get(0),item.get(1));
        }
        int i=0;
        while(i<n){
            if(s.charAt(i)=='('){
                int j = i+1;
                while(j<n && s.charAt(j)!=')'){
                    j++;
                }
                String str = s.substring(i+1,j);
                sb.append(hm.getOrDefault(str,"?"));
                i=j+1;
            }
            else{
                sb.append(s.charAt(i++));
            }
        }
        return sb.toString();
    }
}