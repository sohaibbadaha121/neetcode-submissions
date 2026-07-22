class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for(int stone : stones){

            maxHeap.offer(-stone);
        }
        while(maxHeap.size() > 1){

            int first = maxHeap.poll();
            int secound = maxHeap.poll();

            if((first+secound) != 0 ){
                maxHeap.offer(first-secound);
            }



        }
        return maxHeap.isEmpty() ? 0 : Math.abs(maxHeap.peek());
    }
}
