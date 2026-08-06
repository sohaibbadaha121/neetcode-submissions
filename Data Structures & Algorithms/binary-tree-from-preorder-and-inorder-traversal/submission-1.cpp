/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        unordered_map<int , int > m ;
        for(int i=0 ; i<inorder.size();i++){
            m[inorder[i]]=i;
        }
        int preInd = 0;
        return dfs(preorder,m,preInd,0, inorder.size()-1);

    }
    private:
    TreeNode* dfs(vector<int> &preorder , unordered_map<int,int> &m , int &preInd , int inS , int inE){
        if(inS>inE){
            return nullptr;
        }
        int rootval = preorder[preInd++]; 
        TreeNode* root = new TreeNode(rootval);
        int mid = m.at(rootval);

        root->left=dfs(preorder,m,preInd,inS,mid-1);
        root->right=dfs(preorder,m,preInd,mid+1,inE);
        return root;
    }

};
