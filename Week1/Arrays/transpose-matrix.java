class Solution {
    public int[][] transpose(int[][] A) {
 
        int r = A.length;
        int c = A[0].length;
        int[][] t = new int[c][r];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                    t[j][i] = A[i][j];
                  
        return t;
    }
}
