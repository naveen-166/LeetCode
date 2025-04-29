class Solution {
    public int islandPerimeter(int[][] grid) {
        int row=grid.length,col=grid[0].length,per=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                    per+=4;
                    if(i>0 && grid[i-1][j]==1) per-=2;
                    if(j>0 && grid[i][j-1]==1) per-=2;
                }
            }
        }
        return per;
        
    }
}