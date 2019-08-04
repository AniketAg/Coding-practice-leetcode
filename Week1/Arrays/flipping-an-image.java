class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int r = A.length;
        int cc = A[0].length;int c;
        int[][] t = new int[cc][r];
        for(int i=0;i<r;i++){
            c = A[0].length;
            for(int j=0;j<cc;j++){
                int temp = t[i][j];     
                t[i][j] = A[i][--c];
                A[i][c] = temp;
            }
                
        }
         for(int i=0;i<r;i++)
            for(int j=0;j<cc;j++){
                if(t[i][j]==1)
                    t[i][j]=0;
                else t[i][j]=1;
            }          
        return t;
    }
}
        
