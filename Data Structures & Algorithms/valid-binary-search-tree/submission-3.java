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
    public boolean isValidBST(TreeNode root) {
            return isValidDfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean isValidDfs(TreeNode node , Long leftBound, Long rightBound){
        if(node==null){
            return true ;
        }
        if(!(leftBound < (long)node.val && (long)node.val < rightBound)){
            return false;
        }
        return isValidDfs(node.left, leftBound, (long)node.val) && isValidDfs(node.right, (long)node.val, rightBound);
    }
}