class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> ans=new ArrayList<>();
        backtrack(ans,0,new StringBuilder(),0,n);
        return ans;
    }
    public static void backtrack(List<String> ans,int open,StringBuilder current,int close,int max){
        if(current.length()==2*max){
            ans.add(current.toString());
            return;
        }
        if(open<max){
            current.append("(");
            backtrack(ans, open+1, current, close, max);
            current.deleteCharAt(current.length()-1);
            }
        if(close<open){
            current.append(")");
            backtrack(ans, open, current, close+1, max);
            current.deleteCharAt(current.length()-1);
        }
    }
}
