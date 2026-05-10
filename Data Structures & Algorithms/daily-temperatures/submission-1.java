class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] res = new int[temperatures.length];
        Stack<int []> stack = new Stack<>(); // [ 0 for the temperatures , for the index ]

        for( int i = 0 ; i < temperatures.length ; i ++){
            int t = temperatures[i];
            while( !stack.isEmpty() && t > stack.peek()[0]){
                int [] prev = stack.pop();
                res[prev[1]] = i - prev[1] ;
            }   

            stack.push(new int[] {t,i});
        }
        return res;
    }
}
