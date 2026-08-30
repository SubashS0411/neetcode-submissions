class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for (int num:stones){
            minheap.offer(-num);
        }
        while (minheap.size()>1){
            int curr=minheap.poll()-minheap.poll();
            if(curr!=0) minheap.offer(curr);
        }
        return minheap.isEmpty()?0:Math.abs(minheap.peek());
    }
}
