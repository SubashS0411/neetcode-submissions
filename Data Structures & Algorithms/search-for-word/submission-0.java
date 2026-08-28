class Solution {
    public boolean exist(char[][] board, String word) {
       int row= board.length,col=board[0].length;
        for (int r = 0; r< row; r++) {
            for (int c = 0; c < col; c++) {
                if(board[r][c]==word.charAt(0)) {
                    if (dfs(board, word, r, c, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][]board,String word,int r,int c,int wordindex){
        if(word.length()==wordindex) return true;
        if(r<0||r>= board.length||c<0||c>= board[0].length||board[r][c]!=word.charAt(wordindex)){
            return false;
        }
        char temp=board[r][c];
        board[r][c]='#';
        boolean found=dfs(board, word, r+1, c, wordindex+1)||
                      dfs(board, word, r-1, c, wordindex+1)||
                      dfs(board, word, r, c+1, wordindex+1)||
                      dfs(board, word, r, c-1, wordindex+1);
        board[r][c]=temp;
        return found;
    }
}
