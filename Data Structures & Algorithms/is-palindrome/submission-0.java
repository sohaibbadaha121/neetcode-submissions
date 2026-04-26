class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder myString = new StringBuilder ();
        for (char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                myString.append(Character.toLowerCase(c));
            }

        }
        return myString.toString().equals(myString.reverse().toString());
    }
}
