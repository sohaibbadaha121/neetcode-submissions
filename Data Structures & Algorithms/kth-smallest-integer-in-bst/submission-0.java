/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pointer = root;
        while(!stack.isEmpty() || pointer!=null){
            while(pointer !=null){
                stack.push(pointer);
                pointer=pointer.left;
            }
            pointer=stack.pop();
            k--;
            if(k==0){
                return pointer.val;
            }
            pointer=pointer.right;
        }
        return -1 ;
    }
}
