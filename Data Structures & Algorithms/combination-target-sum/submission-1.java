class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         List<List<Integer>> ans=new ArrayList<>();
        List<Integer> sum=new ArrayList<>();
        dfs(nums,target,sum,ans,0);
        return ans;
    }
    public void dfs(int[] nums,int target,List<Integer> sum,List<List<Integer>> ans,int current){
        if(target==0){
            ans.add(new ArrayList<>(sum));
            return;
        }
        if(target<0 || current>= nums.length) {
            return;
        }
            sum.add(nums[current]);
            dfs(nums, target-nums[current], sum, ans, current);
            sum.remove(sum.size()-1);
            dfs(nums, target, sum, ans, current+1);
    }
}
