class Solution {
    public int maxProfit(int[] arr) {
        int minBuy=arr[0];
        int maxp=0;
        for (int element:arr){
            maxp=Math.max(maxp,element-minBuy);
            minBuy=Math.min(minBuy,element);
        }
        return maxp;
    }
}
