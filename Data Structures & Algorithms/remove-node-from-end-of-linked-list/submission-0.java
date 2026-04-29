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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            // two pointers the first in the head of the ListNode 
            // the second shifted by n 
            // so when the second pointers reach the null the first pointer well be in the node that we need to delete it 
            ListNode dum = new ListNode(0);
            dum.next=head;
            ListNode first = dum;
            ListNode second = head;
            while(n>0 && head!=null ){
                second=second.next;
                n--;
            }

            while(second !=null){
                first=first.next;
                second=second.next;
            }
            first.next=first.next.next;
            return dum.next;
    }
}
