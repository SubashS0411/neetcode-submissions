class Solution {
    public void reverseString(char[] s1) {
        int s=0,e=s1.length-1;
        while(s<e){
            char temp=s1[s];
            s1[s]=s1[e];
            s1[e]=temp;
            s++;
            e--;
        }
    }
}