class Solution {
    public String mostCommonWord(String paragraph, String[] banned) 
    {
      paragraph = paragraph.toLowerCase();
        String word = "";
        String [] words = paragraph.split("\\W+");
        Map<String, Integer> map = new HashMap<>();
        int maxRep = 0;

        for (int i=0; i < words.length; i++)
        {
            if(words[i].length()==0)
                continue;
            
            if(map.containsKey(words[i]))
                map.put(words[i],(map.get(words[i])+1));
            
            else    map.put(words[i],1);
            
            if(map.get(words[i])>maxRep && !isBanned(words[i],banned))
            {
                    maxRep = map.get(words[i]);
                    word = words[i];
            }
        }

        return word;
    }

    
   public boolean isBanned (String word, String[] banned)
   {
       for (String ban: banned) 
           if(word.equalsIgnoreCase(ban))
               return true;
   
       return false;  
    }
}
