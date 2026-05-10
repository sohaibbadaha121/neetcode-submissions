class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

            int n = temperatures.length;
            int [] result = new int[n];

            for (int i= 0 ; i <n ; i ++){
                  int c = 1;
                  int j = i +1; 

                  while (j < n ){
                    if (temperatures[j] > temperatures[i]){
                        break;
                    }

                    c ++;
                    j ++;
                  }  
                    if ( j == n){
                        c=0;
                    }                
                     else{
                        c=c;
                     }   
                  result[i] = c;

            }

        return result;
    }
}
