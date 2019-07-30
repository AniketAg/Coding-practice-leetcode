class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int set, flag;
        
        for (int i = 0; i < 9; i++) 
        {
            set = 0;
            for (int j = 0; j < 9; j++) 
                if (board[i][j] != '.') 
                {
                    int k = board[i][j] - '1';
                    flag = 1 << k;
                    if ((set & flag) > 0)
                        return false;
                    set |= flag;
                }
        }

        for (int i = 0; i < 9; i++) 
        {
            set = 0;
            for (int j = 0; j < 9; j++) 
                if (board[j][i] != '.') 
                {
                    int k = board[j][i] - '1';
                    flag = 1 << k;
                    if ((set & flag) != 0)
                        return false;
                    set |= flag;
                }
        }
        
        for (int i = 0; i < 9; i++) 
        {
            set = 0;
            int row = i / 3 * 3;
            int col = i % 3 * 3;
            for (int j = 0; j < 9; j++) 
                if (board[row + j / 3][col + j % 3] != '.') 
                {
                    int k = board[row + j / 3][col + j % 3] - '1';
                    flag = 1 << k;
                    if ((set & flag) != 0)
                        return false;
                    set |= flag;
                }
        }
        
        return true;
    }
}
