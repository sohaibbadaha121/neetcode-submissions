class Solution {
    public int lengthOfLongestSubstring(String s) {
        // we need to create a set to be our window 
        // we need to loop for all the string [a,b,c,a,b,c,c] if the char is not dublicated we add it to the window
        // if dublicated we need to remove for the left the window 
        int res = 0 ;
        int l = 0 ;
        HashSet<Character> windowset = new HashSet<>();
        for(int r =0 ; r<s.length(); r ++){
            while(windowset.contains(s.charAt(r))){
                windowset.remove(s.charAt(l));
                l ++;
            }
            windowset.add(s.charAt(r));
            res=Math.max(res, r-l+1);

        }
        return res ;
    }
}
