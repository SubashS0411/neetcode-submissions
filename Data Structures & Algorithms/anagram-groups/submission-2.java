class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          if(strs.length==0) return new ArrayList<>();
        Map<String,List<String >> sol=new HashMap<>();
        for (String str:strs) {
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String newword=new String(ch);
           sol.computeIfAbsent(newword,k->new ArrayList<>()).add(str);
    }
     return new ArrayList<>(sol.values());
    }
}
