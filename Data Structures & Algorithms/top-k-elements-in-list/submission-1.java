class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> min=new PriorityQueue<>(
                (a,b)->map.get(a)- map.get(b)
        );
        for (int key: map.keySet()) {
            min.add(key);
            if(min.size()>k){
                min.poll();
            }
        }
        int[] ans =new int[k];
        for (int i = 0; i < k; i++) {
            ans[i]=min.poll();
        }
        return ans;
    }
}
