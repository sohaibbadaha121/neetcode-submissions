class Solution {
public:
    int calPoints(vector<string>& operations) {
        stack<int> records ;
        
        for(const string& s : operations){
            
            if(s=="+"){
                int a = records.top();
                records.pop();
                int b = records.top();
                records.push(a);
                int h = a+b;
                records.push(h);
            }
            else if(s=="C"){
                records.pop();
            }
             else if(s=="D"){
                records.push(records.top()*2);
            }
            else {
                records.push(stoi(s));
            }

        }
        int sum = 0 ;
        while(!records.empty()){
            sum += records.top();
            records.pop();
        }
        return sum ;
    }
  
};