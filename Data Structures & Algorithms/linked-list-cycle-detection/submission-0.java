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
    public boolean hasCycle(ListNode head) {
        // we need to create a hash set to store the nodes 
        // when we store the nodes in the hash set we store the memory location (the references)
        // when we reach any node and check if our hashset contains this node the we return true and we have a cycle
        HashSet<ListNode> nodes = new HashSet<>();
        while (head !=null){
            if(nodes.contains(head)){
                return true;
            }
            nodes.add(head);
            head=head.next;
        }
        return false;
    }

}
