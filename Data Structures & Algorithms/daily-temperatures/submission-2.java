class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int pre=st.pop();
                ans[pre]=i-pre;
            }
            st.push(i);
        }
        return ans;
    }
}
