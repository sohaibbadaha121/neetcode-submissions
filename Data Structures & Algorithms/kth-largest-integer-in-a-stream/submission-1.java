
class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int K;
    public KthLargest(int k, int[] nums) {
        this.minHeap = new PriorityQueue<>();
        this.K=k;

        for(int num : nums){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {

        minHeap.offer(val);
        if(minHeap.size() > K){
            minHeap.poll();

        }
        return minHeap.peek();
    }
}
