class Solution 
{
    private final char EMPTY_ENTRY = '.';
    private final int n = 9;
    private final int gridSize = 3;

    public void solveSudoku(char[][] board) 
    {
    	solveSudokuHelper(board, 0, 0);
    }

    private boolean solveSudokuHelper(char[][] board, int i, int j) 
    {
	    if (i == n) 
        {
		    i = 0; ++j;
		    if (j == n) 
        	    return true;
		}

	    if (board[i][j] != EMPTY_ENTRY) 
            return solveSudokuHelper(board, i + 1, j);
	    
	    for (char val = '1'; val <= '9'; val++) 
            if (isValidToAdd(board, i, j, val)) 
            {
			    board[i][j] = val;
			    if (solveSudokuHelper(board, i+1, j)) 
        		    return true;
		    }
	    board[i][j] = EMPTY_ENTRY;
	    return false;
    }
    
    private boolean isValidToAdd(char[][] board, int i, int j, char val) 
    {
	    for (int a = 0; a < n; a++) 
        if (board[a][j] == val) 
           return false;
	
        for (int b = 0; b < n; b++)  
        if (board[i][b] == val) 
			return false;
		
        int gridI = i / gridSize,
		gridJ = j / gridSize;

	    // check if the given value is already filled in the corresponding grid
	    for (int a = 0; a < gridSize; a++) 
		    for (int b = 0; b < gridSize; b++) 
                if (board[gridI * gridSize + a][gridJ * gridSize + b] == val) 
            	    return false;

	    return true;
    }
}
