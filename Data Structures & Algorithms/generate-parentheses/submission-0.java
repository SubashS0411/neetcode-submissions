class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> ans=new ArrayList<>();
        generateAll(new char[2*n],0,ans);
        return ans;
    }
    public static void generateAll(char[] current,int n,List<String> ans){
        if(n== current.length){
            if(isValid(current)){
                ans.add(new String(current));
            }
            return;
        }
        current[n]='(';
        generateAll(current,n+1,ans);
        current[n]=')';
        generateAll(current, n+1, ans);
    }
    public static boolean isValid(char[] current){
        int balance=0;
        for(char c:current){
            if(c=='(') balance++;
            else balance--;
            if(balance<0) return false;
        }
        return balance==0;
    }
}
