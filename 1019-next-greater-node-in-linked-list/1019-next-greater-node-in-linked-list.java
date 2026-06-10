class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> ls = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        while (head != null) {
            ls.add(head.val);
            head = head.next;
        }

        int n = ls.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && ls.get(i) > ls.get(st.peek())) {
                ans[st.pop()] = ls.get(i);
            }

            st.push(i);   
        }

        return ans;
    }
}