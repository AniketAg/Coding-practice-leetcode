int[][] spiralNumbers(int n) {
    
    int[][] ans = new int[n][];
    for (int i=0; i<n; i++)
    ans[i] = new int[n];
    
    int p=1, r=0;
    for (; n>0; n-=2)
    {
        for (int a=0; a<n; a++) 
            ans[r][a+r]=p++;
        for (int b=r+1; b<n+r; b++) 
            ans[b][n-1+r]=p++;
        for (int c=n-2+r; c>=r; c--) 
            ans[n-1+r][c]=p++;
        for (int d=n-2+r; d>r; d--) 
            ans[d][r]=p++;
        r++;
    }
    return ans;
}
