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
    //submit krna h
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ListNode curr = head.next;
        ListNode prev = head;
        ListNode nextNode = head.next.next;
        int idx = 1;
        int min = 100000;
        int first = 0;
        int last = 0;
       
        while(nextNode!=null){
            if(isCrit(prev,curr,nextNode)){
               if(first==0) first = idx;
               else min = Math.min(min,idx-last);
               last = idx;
            }

            prev = curr;
            curr = nextNode;
            nextNode = nextNode.next;
            idx++;
        }
        if(first == last) return new int[] {-1,-1};

        return new int[] { min,last-first};
    }
    public boolean isCrit(ListNode prev, ListNode curr, ListNode nextNode){
        return (curr.val<prev.val && curr.val<nextNode.val||curr.val>prev.val && curr.val>nextNode.val);
    }
}