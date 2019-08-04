public class Solution 
{
    private int max = 1;
    private int[][] dirs = {{1,0},{0,-1},{-1,0},{0,1}};
    
    public int longestIncreasingPath(int[][] matrix) 
    {
        if(matrix==null || matrix.length==0)
            return 0;
            
        int row = matrix.length;
        int col = matrix[0].length;
        
        int[][] longest = new int[row][col];
        for(int i=0;i<row;++i)
            for(int j=0;j<col;++j)
                dfs(i,j,matrix,longest);
        
        return max;
    }
    
    public int dfs(int i, int j, int[][] matrix, int[][] longest)
    {
        if(longest[i][j]!=0)
            return longest[i][j];
            
        int localMax = 1;
        
        for(int[] dir : dirs)
        {
            int x = i+dir[0];
            int y = j+dir[1];
            if(x<0 || x>=matrix.length || y<0 || y>=matrix[0].length || matrix[x][y]<=matrix[i][j] )
                continue;
            localMax = Math.max(localMax, 1+dfs(x,y,matrix,longest));
        }
        
        max = Math.max(max, localMax);
        longest[i][j]=localMax;
        return localMax;
    }
}
