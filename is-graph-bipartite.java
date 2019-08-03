class Solution 
{

    Map<Integer,List<Integer>> g = new HashMap<>();
    Map<Integer,Integer> color = new HashMap<>();
    
    public boolean isBipartite(int[][] graph) 
    {
        for(int i = 0; i < graph.length; i++)
        {
            List<Integer> l = g.getOrDefault(i, new ArrayList<>());
            for(int j : graph[i])
                l.add(j);
            g.put(i, l);
            color.put(i, -1);
        }
        
        for(int i : g.keySet())
            if(color.get(i) == -1)
                if(bfs(i) == false)
                    return false;
    
        return true;
    }
    
    public boolean bfs(int u)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(u); color.put(u, 0);
        
        while(!q.isEmpty())
        {
            int cur = q.poll();
            int c = color.get(cur);
            
            for(int i : g.get(cur))
                if(color.get(i) == c)
                    return false;
                else if(color.get(i) == -1 )
                {
                    color.put(i, 1-c);
                    q.add(i);                    
                }
        }
        return true;
    }
    
    public boolean dfs(int u)
    {
        for(int j : g.get(u))
        {
            if(color.get(j) == -1)
            {   
                color.put(j, 1 - color.get(u)); 
                if(!dfs(j)) return false;
            }
            if(color.get(j) == color.get(u)) return false;
        }
        
        return true;
    }
}
