class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int fromIndex = 0;
        for (char c : s.toCharArray()) 
        {
            fromIndex = t.indexOf(c, fromIndex);
            if (fromIndex++ < 0) 
                return false;
        }
        return true;
        
        /*
        char[] g = s.toCharArray();
        char[] m = t.toCharArray(); 
        
        Arrays.sort(g);
        Arrays.sort(m);
        int count=0,i=0,j=0;
        while(i < g.length && j < m.length)
            if(g[i]==m[j++])
            {
                i++;
                count++;
            }
        if(count == g.length)
            return true;
        
        return false;
        */
    }
}
