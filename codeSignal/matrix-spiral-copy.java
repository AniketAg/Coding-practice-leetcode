import java.io.*;
import java.util.*;

class Solution {

  static int[] spiralCopy(int[][] inputMatrix) {
   int mRow = inputMatrix.length; //row length
   int nCol = inputMatrix[0].length;//column length
    
    int result[] = new int[mRow*nCol];
    int i, kRow=0, lCol=0;int k = 0;
    // i - iterator
    //m - ending row index
    // n - ending column index
    // k - starting row index
    // l - starting column index
    
    while(kRow < mRow && lCol < nCol ){
      for(i = lCol; i<nCol ; i++)
      {
        result[k++] = inputMatrix[kRow][i];
      }
      kRow++;
      for(i = kRow; i < mRow; i++ )
      {
        result[k++] = inputMatrix[i][nCol-1];
      }
      nCol--;
      if(kRow<mRow)
      {
        for(i = nCol - 1; i >= lCol ; i--)
          result[k++] = inputMatrix[mRow-1][i];
      
      mRow--;
      }
      if(lCol < nCol)
      {
        for( i = mRow - 1; i >=kRow; i--)
          result[k++] = inputMatrix[i][lCol];
        lCol++;
      }
    }
    return result;
    // your code goes here
  }

  public static void main(String[] args) {

  }

}
