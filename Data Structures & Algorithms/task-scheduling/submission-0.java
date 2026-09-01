class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counts=new int[26];
        for(char task:tasks){
            counts[task-'A']++;
        }
        int time=0;
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int count:counts){
            if(count>0){
                maxheap.add(count);
            }
        }
        Queue<int[]> waitingRoom=new LinkedList<>();
        while(!maxheap.isEmpty() || !waitingRoom.isEmpty()){
            time++;
            if(!maxheap.isEmpty()){
                int currentcount= maxheap.poll();
                currentcount--;
                if(currentcount>0){
                    waitingRoom.add(new int[] {currentcount,time+n});
                }
            }
            if(!waitingRoom.isEmpty() && waitingRoom.peek()[1]==time){
                maxheap.add(waitingRoom.poll()[0]);
            }
        }
        return time;
    }
}
