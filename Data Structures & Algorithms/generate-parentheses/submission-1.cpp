class Solution {
public:
    vector<string> generateParenthesis(int n) {
            vector<string> res;
            string sub ;
            dfs(0,0,n,sub,res);
            return res;
    }

    void dfs (int openN , int closeN , int n, string &sub , vector<string> &res){
        if(openN==closeN && openN==n){
            res.push_back(sub);
            return ;
        }
        if(openN<n){
            sub+='(';
            dfs(openN+1,closeN,n , sub ,res);
            sub.pop_back();
        }
        if(closeN <openN){
            sub+=')';
            dfs(openN,closeN+1,n,sub,res);
            sub.pop_back();
        }
    }
};
