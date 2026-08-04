class Solution {
    public int[] twoSum(int[] arr, int target) {
        int left=0,right= arr.length-1;
        while (left<right){
            int curr=arr[left]+arr[right];
            if(curr==target){
                return new int[]{left+1,right+1};
            } else if (curr>target) {
                right--;
            }
            else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}
