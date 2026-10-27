class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        stack<int> st ;

        for(int &a : asteroids){
            while(!st.empty() && a<0  && st.top() >0){
                
                int dif = a + st.top();
                if(dif<0){
                    st.pop();
                }
                else if(dif > 0){
                    a=0;
                }
                else{
                    a=0;
                    st.pop();
                }
            }
            if(a!=0){
                st.push(a);
            }
        }
        vector<int> res;
        while(!st.empty()){
            res.push_back(st.top());
            st.pop();
        }
        reverse(res.begin(), res.end());
        return res;
    }
};