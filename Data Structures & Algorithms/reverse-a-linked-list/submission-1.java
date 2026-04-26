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
    public ListNode reverseList(ListNode head) {
      if(head ==null || head.next==null){
        return head; // this is the base case for our recursion 
      }
      ListNode newhead = reverseList(head.next);
      // if we in the base case we need to return the head (the last node in the our linked list)
      // what we can do after the base case ? 
    //    we need to do revers the nodes
      head.next.next=head;
      head.next=null;
        return newhead;
    }
}
