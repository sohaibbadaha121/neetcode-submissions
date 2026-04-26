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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // we need to cearte dummy node to be our start node and without the dummy node we need to check manulay any node of the to lists to be our start
        // also we need to create a pointer node to use it to add the nodes for the marged list
        ListNode dummy = new ListNode(0);
        ListNode pointer = dummy;

        while(list1!=null &&list2!=null){
            if(list1.val < list2.val){
                pointer.next=list1;
                list1=list1.next;
            }
            else {
                pointer.next=list2;
                list2=list2.next;
            }
            pointer = pointer.next;
        }

        // now what if one of the two list becomes empty and the other list has a valuse after comparison ?
        if(list1!=null){
            pointer.next=list1;
        }
        else {
            pointer.next= list2;
        }
        // we return dummy .next because the first node in the dommy is 0
        return dummy.next;
    }

}