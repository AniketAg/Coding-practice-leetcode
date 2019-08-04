class Solution {
    public void solve(char[][] board) 
    {
        if(board.length == 0) return;
        
        for(int i = 0; i< board[0].length; i++) 
            DFS(board, 0, i);
        
        for(int i = 0; i< board[0].length; i++) 
            DFS(board, board.length-1, i);
                
        for(int i = 0; i< board.length; i++) 
            DFS(board, i, 0);
                
        for(int i = 0; i< board.length; i++) 
            DFS(board, i, board[0].length-1);
                
        for(int i =0 ;i<board.length; i++) 
            for(int j=0; j<board[0].length; j++) 
                if(board[i][j] == 'O') 
                   board[i][j] = 'X';
                else if (board[i][j] == 'W') 
                   board[i][j] = 'O';
     }
    
    public void DFS(char[][] board, int i, int j) 
    {
        if(i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != 'O')  return;
        
        board[i][j] = 'W';
        
        DFS(board, i+1, j);
        DFS(board, i-1, j);
        DFS(board, i, j+1);
        DFS(board, i, j-1);
    }
}
