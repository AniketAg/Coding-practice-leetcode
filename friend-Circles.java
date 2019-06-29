public class Solution {
    public int findCircleNum(int[][] M) 
    {
        if(M==null || M.length<1) return 0;
        
        int count = M.length;
        
        int[] parent = new int[count];
    
        for(int i=0; i < parent.length; i++)
            parent[i]=i;
                
        for(int i=0; i<M.length; i++)
            for(int j=0;j<M[0].length;j++)
            {
                if(M[i][j]==0||(i==j)) continue;
            
                int p_i=findparent(parent,i);
                int p_j=findparent(parent,j);
                
                if(p_i!=p_j)
                {
                    parent[p_i]=parent[p_j];
                    count--;
                }
            }
        
        return count;
    }
    
    public int findparent(int[] parent,int j)
    {
        while(j!=parent[j])
        {
            parent[j]=parent[parent[j]];
            j=parent[j];
        }
        return j;
    }
}
