class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            maxheap.add(num);
        }
      while(maxheap.size()>1) {
            int x=maxheap.poll();
            int y=maxheap.poll();
            if(x!=y) {
                maxheap.add(x-y);
            }

        }
        return maxheap.isEmpty()?0: maxheap.peek();
    }
}
