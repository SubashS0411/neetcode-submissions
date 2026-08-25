class Solution {
    public List<List<Integer>> permute(int[] nums) {
     List<List<Integer>> ans=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        backtrack(ans,new ArrayList<>(),nums,freq);
        return ans;
    }
    public static void backtrack(List<List<Integer>> ans,List<Integer> current,int[] nums,boolean[] freq ){
        if(nums.length==current.size()){
            ans.add(new ArrayList<>(current));
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                current.add(nums[i]);
                backtrack(ans, current, nums, freq);
                current.remove(current.size() - 1);
                freq[i] = false;
            }
        }
    }
}
