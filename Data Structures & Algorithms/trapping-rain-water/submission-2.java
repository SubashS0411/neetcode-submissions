class Solution {
    public int trap(int[] arr) {
        int n= arr.length;
        if(n==0) return 0;
        int left=0,right=n-1;
        int leftMax=arr[left],rightMax=arr[right];
        int res=0;
        while (left<right){
            if(leftMax<rightMax){
                left++;
                leftMax=Math.max(leftMax,arr[left]);
                res+=leftMax-arr[left];
            }
            else{
                right--;
                rightMax=Math.max(rightMax,arr[right]);
                res+=rightMax-arr[right];
            }
        }
        return res;
    }
}
