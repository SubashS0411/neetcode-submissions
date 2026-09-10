class Solution {
    private final int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
    public int orangesRotting(int[][] grid) {
         if(grid==null||grid.length==0) return 0;
        int row=grid.length,cols= grid[0].length;
        Queue<int[]> queue=new LinkedList<>();
        int fresh=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0)return 0;
        int minutes=0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotten = false;
            for (int i = 0; i <size; i++) {
                int[] current = queue.poll();
                int r = current[0], c = current[1];
                for (int[] dir:directions){
                    int nextR=r+dir[0],nextC=c+dir[1];
                    if(nextR<0||nextC<0||nextR>=row||nextC>=cols||grid[nextR][nextC]!=1){
                        continue;
                    }
                    grid[nextR][nextC]=2;
                    queue.add(new int[]{nextR,nextC});
                    fresh--;
                    rotten=true;
                }
            }
            if(rotten){
                minutes++;
            }
        }
        return fresh==0?minutes:-1;
    }
}
