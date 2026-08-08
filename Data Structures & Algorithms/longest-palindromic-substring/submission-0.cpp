class Solution {
public:
    string longestPalindrome(string s) {
        int resIndx = 0;
        int resLen = 0 ;
        for(int i = 0 ; i<s.size();i++){
            int l = i ;
            int r = i;
            while(l>=0  && r<s.size() && s[l]==s[r]){
                if(r-l+1 >resLen){
                    resLen = r-l+1;
                    resIndx = l ; 
                }
                l--;
                r++;
            }

            l=i;
            r=i+1;

             while(l>=0 && r<s.size() && s[l]==s[r]){
                if(r-l+1 >resLen){
                    resLen = r-l+1;
                    resIndx = l ; 
                }
                l--;
                r++;
            }

        }
        return s.substr(resIndx,resLen);
    }
};
