class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans=new ArrayList<>();
        backTrack(ans,new ArrayList<>(),nums,0);
        return ans;
    }
    public static void backTrack(List<List<Integer>> result,List<Integer> current,int[] arr,int index){
        result.add(new ArrayList<>(current));
        for (int i = index; i < arr.length ; i++) {
            current.add(arr[i]);
            backTrack(result,current,arr,i+1);
            current.remove(current.size()-1);
        }
    }
}
