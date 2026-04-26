class Solution {
    public int maxArea(int[] heights) {
        int l =0;
        int r = heights.length -1;
        int max =0;
        while (r>l){
            int w = r-l;
            int h = Math.min(heights[r],heights[l]);
            int amount = w*h;
            max =Math.max(max,amount);
            if(heights[r]>heights[l]){
                l++;
            }
            else {
                r--;
            }
        }
        return max;
    }
}
