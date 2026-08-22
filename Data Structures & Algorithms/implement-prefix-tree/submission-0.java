class PrefixTree {
    private Trienode root;
    public PrefixTree(){
        root=new Trienode();
    }

    public void insert(String word) {
        Trienode curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
               curr.children[index]=new Trienode();
            }
            curr=curr.children[index];
        }
        curr.endofWord=true;
    }

    public boolean search(String word) {
        Trienode curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
               return false;
            }
            curr=curr.children[index];
        }
        return curr.endofWord;
    }

    public boolean startsWith(String word) {
        Trienode curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return true;
    }
}

class Trienode{
    Trienode[] children;
    boolean endofWord;
    Trienode(){
        children=new Trienode[26];
        endofWord=false;
    }
}