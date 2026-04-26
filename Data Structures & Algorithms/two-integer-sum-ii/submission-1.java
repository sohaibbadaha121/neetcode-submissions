class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int r=0, l= numbers.length -1;
        while (r<l){
            if(numbers[r] + numbers[l] == target){
                return new int [] {r+1,l+1};
            }
            else if (numbers[r] + numbers[l] >target){
                l --;
            }
            else if (numbers[r] + numbers[l] < target){
                r ++;
            }
        }
        return new int [] {0,0};
}
}