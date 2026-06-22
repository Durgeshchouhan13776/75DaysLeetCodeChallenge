class Solution {
    public String removeStars(String s) {
        Stack<Character> st  = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!='*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
}