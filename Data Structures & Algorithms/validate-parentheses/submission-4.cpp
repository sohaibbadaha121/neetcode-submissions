class Solution {
public:
    bool isValid(string s) {
        stack<char> st ;
        unordered_map<char,char> cToO={
            {')' , '('},
            {'}' , '{'},
            {']','['} 
        };
            for(char c : s){
                if(cToO.count(c)){
                    if(!st.empty() && st.top() == cToO[c]){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    st.push(c);
                }
            }
            return st.empty();
    }
};
