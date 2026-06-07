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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> p1= new LinkedList<>();
        Queue<TreeNode> q1= new LinkedList<>();
        p1.add(p);
        q1.add(q);
        while(!p1.isEmpty() && !q1.isEmpty()){
            for(int i =0 ; i <p1.size() ;i++){
                TreeNode nodeP = p1.poll();
                TreeNode nodeQ= q1.poll();
               if (nodeP == null && nodeQ == null) {
                     continue;
                   }
                if(nodeP==null || nodeQ==null){
                    return false;
                }
                if (nodeP.val != nodeQ.val) {
                    return false;
                }
              
                p1.add(nodeP.left);
                p1.add(nodeP.right);
                q1.add(nodeQ.left);
                q1.add(nodeQ.right);
            }
        }
        return true;
    }
}
