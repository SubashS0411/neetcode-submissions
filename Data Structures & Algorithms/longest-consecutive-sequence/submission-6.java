class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int count=1;
        int high=1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            if(nums[i-1]+1!=nums[i]) {
                count=1;
            }
            else{
                count++;
                high=Math.max(count,high);
            } 
        }
        return high;
    }
}
