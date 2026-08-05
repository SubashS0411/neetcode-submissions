class Solution {
    public int longestConsecutive(int[] arr) {
        int n= arr.length;
        if(n==0) return 0;
        int curr=0;
        int longest=1;
        int smallest=Integer.MIN_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(arr[i]-1==smallest){
                curr++;
                smallest=arr[i];
            } else if (arr[i]!=smallest) {
                curr=1;
                smallest=arr[i];
            }
            longest=Math.max(longest,curr);
        }
        return longest;
    }
    
}