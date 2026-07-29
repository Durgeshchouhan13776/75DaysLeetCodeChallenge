/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] ans = new ListNode[k];

        int n = countNode(head);

        int base = n / k;
        int extra = n % k;

        ListNode curr = head;

        for (int i = 0; i < k; i++) {

            ans[i] = curr;

            int partSize = base + (extra > 0 ? 1 : 0);

            if (extra > 0) extra--;

            for (int j = 1; j < partSize && curr != null; j++) {
                curr = curr.next;
            }

            if (curr != null) {
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        }

        return ans;
    }

    public int countNode(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
