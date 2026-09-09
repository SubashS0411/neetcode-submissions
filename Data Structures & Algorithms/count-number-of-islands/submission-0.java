class Solution {
    public int numIslands(char[][] grid) {
     int row=grid.length;
        int cols= grid[0].length;
        int numofisland=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j]=='1'){
                    numofisland++;
                    sinkdfs(grid,i,j);
                }
            }
        }
        return numofisland;
    }
    public static void sinkdfs(char[][]grid,int row,int col){
        if(row<0||col<0||row>= grid.length||col>= grid[0].length||grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        sinkdfs(grid, row-1, col);
        sinkdfs(grid, row+1, col);
        sinkdfs(grid, row, col-1);
        sinkdfs(grid, row, col+1);   
    }
}
