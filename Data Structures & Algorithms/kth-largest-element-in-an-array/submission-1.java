class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for(int num : nums){
            maxHeap.offer(-num);
        }
        int kth =0 ;

        while(k > 0 ){
            kth=maxHeap.poll();
            k--;

        }
        return -kth;
    }
}
