class Solution {
    public int trap(int[] arr) {
         if(arr.length==0){
            return 0;
        }
        int res=0;
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int leftmax=arr[i];
            int rightmax=arr[i];
            for (int j = 0; j < i; j++) {
                leftmax=Math.max(leftmax,arr[j]);
            }
            for (int j = i+1; j <n ; j++) {
                rightmax=Math.max(rightmax,arr[j]);
            }
            res+=Math.min(leftmax,rightmax)-(arr[i]);
        }
        return res; 
    }
}
