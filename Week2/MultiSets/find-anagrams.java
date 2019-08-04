class Solution 
{
      public List<Integer> findAnagrams(String s, String p) 
      {
        List<Integer> res = new ArrayList<>();
        
        int[] map = new int[26];
        
        for(int i = 0; i < p.length(); i++) 
            map[p.charAt(i) - 'a']++;
        
        int j = 0;
        
        for(int i = 0; i < s.length(); i++) 
        {
        
            map[s.charAt(i) - 'a']--;
            
            while(map[s.charAt(i) - 'a'] < 0) 
                map[s.charAt(j++) - 'a']++;
            
            if(i - j + 1 == p.length()) 
                res.add(j);
        
        }
        
        return res;
    }
}
