class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),nums,target,0);
        return ans;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> current,int[] candidates,int remain,int start){
        if(remain<0) return;
        if(remain==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(result,current,candidates,remain-candidates[i],i);
            current.remove(current.size()-1);
        }
    }
}
