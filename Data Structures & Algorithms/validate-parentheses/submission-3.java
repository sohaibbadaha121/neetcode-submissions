class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap <Character , Character> closeAndopen = new HashMap <>();
        closeAndopen.put(')' , '(');
        closeAndopen.put('}' , '{');
        closeAndopen.put(']' , '[');
        for( char c : s.toCharArray()){
            if(closeAndopen.containsKey(c)){
                if( !stack.isEmpty() && stack.peek()== closeAndopen.get(c)){
                    stack.pop();
                }
                else {
                    return false ;
                }
            }
            
            else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
