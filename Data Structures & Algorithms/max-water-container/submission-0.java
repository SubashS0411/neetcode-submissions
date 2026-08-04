class Solution {
    public int maxArea(int[] arr) {
        int left=0,right=arr.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int height=Math.min(arr[left],arr[right]);
            int area=height*(right-left);
            max=Math.max(max,area);
            while (left<right && arr[left]<=height) left++;
            while(left<right && arr[right]<=height) right--;
        }
        return max;
    }
}
