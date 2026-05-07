class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for( char c : s.toCharArray()){
            if(c==')' || c=='}' || c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(c== '}' && top != '{') return false ;
                if(c== ')' && top != '(') return false ;
                if(c== ']' && top != '[') return false ;
                
            }
            else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
