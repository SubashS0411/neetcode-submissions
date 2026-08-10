class Solution {
    public int minEatingSpeed(int[] piles, int hours) {
        int left=1;
        int right=1;
        for (int pile:piles){
            right=Math.max(right,pile);
        }
        int result=right;
        while (left<=right){
            int mid=left+(right-left)/2;
            long thours=0;
            for(int pile:piles){
                thours+=(pile+mid-1)/mid;
            }
            if(thours<=hours){
                result=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return result;
    }
}
