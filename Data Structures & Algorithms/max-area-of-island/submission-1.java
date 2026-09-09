class Solution {
    //  private static final int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
       if(grid==null|| grid.length==0) return 0;
        int maxArea=0,row=grid.length,col= grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j]==1){
                    int current=dfsArea(grid,i,j);
                    maxArea=Math.max(current,maxArea);
                }
            }
        }
        return maxArea;
    }
    public static int dfsArea(int[][] grid,int row,int col){
        if(row<0||col<0||row>= grid.length||col>= grid[0].length||grid[row][col]==0){
            return 0;
        }
        grid[row][col]=0;
        int area=1;
        
        area+= dfsArea(grid,row-1,col);
        area+= dfsArea(grid,row,col+1);
        area+= dfsArea(grid,row+1,col);
        area+= dfsArea(grid,row,col-1);
        return area; 
    }
}
