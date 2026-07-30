/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            int g = gcd(temp.val, temp.next.val);

            ListNode newNode = new ListNode(g);

            newNode.next = temp.next;
            temp.next = newNode;

            temp = newNode.next;
        }

        return head;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}