class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int n = A.length;int temp,t;
        for (int i=0; i<n;i++)
            if(A[i]%2!=0)
            {
                temp = A[--n];
                A[n]=A[i];
                A[i]=temp;
                while(A[i]%2!=0 && i<n)
                {
                    t = A[--n];
                    A[n]=A[i];
                    A[i]=t;
                }
            }    
        return A;
    }
}
