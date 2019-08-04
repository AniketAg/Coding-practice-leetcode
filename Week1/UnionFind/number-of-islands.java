class Solution {
   private void zero(char[][] grid, int row, int col) 
     {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) return;
        if (grid[row][col] == '0') return;
        grid[row][col] = '0';
        zero(grid, row - 1, col);
        zero(grid, row + 1, col);
        zero(grid, row, col - 1);
        zero(grid, row, col + 1);
    }

    public int numIslands(char[][] grid) 
    {
        int count = 0;
        if (grid.length == 0) return 0;
        for (int row = 0; row < grid.length; row++)
            for (int col = 0; col < grid[0].length; col++)
                if (grid[row][col] == '1') 
                {
                    count++;
                    zero(grid, row, col);
                }
        return count;
    }
}
