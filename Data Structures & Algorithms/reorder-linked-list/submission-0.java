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
    public void reorderList(ListNode head) {
        // first we need to find the middle of the LinkedList we can use fast and slow pointers 
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       // now we need to reverce the secound part of the linkedList
       ListNode sp = slow.next;
       ListNode prev=slow.next=null;
       while(sp!=null){
        ListNode temp= sp.next;
        sp.next=prev;
        prev=sp;
        sp=temp;
       }
       // now we need to merge the two lists
       ListNode f= head;
       sp=prev;
       while(sp!=null){
        ListNode temp1 = f.next;
        ListNode temp2= sp.next;
        f.next=sp;
        sp.next=temp1;
        f=temp1;
        sp=temp2;

       }

    }
}
