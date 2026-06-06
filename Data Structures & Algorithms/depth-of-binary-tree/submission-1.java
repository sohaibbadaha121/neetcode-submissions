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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList<>();
        if(root!=null){
            bfs.add(root);
        }
        int levels=0;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            for(int i = 0 ; i<size ; i++){
                TreeNode node = bfs.poll();
                if(node.right!=null){
                    bfs.add(node.right);
                }
                if(node.left!=null){
                    bfs.add(node.left);
                }
            }
            levels++;
        }
        return levels;
    }
}
