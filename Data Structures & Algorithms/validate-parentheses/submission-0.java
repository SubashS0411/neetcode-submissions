class Solution {
    public boolean isValid(String s) {
        Stack<Character> paran=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='(') paran.push(')');
            else if (ch=='{') paran.push('}');
            else if (ch=='[') paran.push(']');
            else {
                if(paran.isEmpty() || paran.pop() !=ch){
                    return false;
                }
        }
        }
            return paran.isEmpty();
    }
}
