class Solution {
    public boolean hasDuplicate(int[] arr) {
       HashSet<Integer> set=new HashSet<>();
        for (int nums:arr){
            if(!set.add(nums)) return true;
        }
        return false;
        
    }
}