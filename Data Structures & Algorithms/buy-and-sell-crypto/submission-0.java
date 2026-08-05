class Solution {
    public int maxProfit(int[] arr) {
        int minprice=Integer.MAX_VALUE;
        int profit=0;
        for (int ele:arr){
            if(ele<minprice){
                minprice=ele;
            } else if (ele-minprice>profit) {
                profit=ele-minprice;
            }
        }
        return profit;   
    }
}
