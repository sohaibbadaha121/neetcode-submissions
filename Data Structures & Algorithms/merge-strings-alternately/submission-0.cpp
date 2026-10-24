class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string res ;
        int point1 = 0 ;
        int point2 = 0;

        while(point1 < word1.size() || point2 < word2.size()){
                if(word1[point1]){
                    res += word1[point1++];
                }
                if(word2[point2]){
                    res+= word2[point2++];
                }
        }
        return res;
    }
};