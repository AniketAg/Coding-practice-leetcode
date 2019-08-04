class Solution {
    public String[] uncommonFromSentences(String A, String B) {
       
        Set<String> hashset = new HashSet<>();
        
        String[] splitA = A.split(" ");
        String[] splitB = B.split(" ");
        
        List<String> repeatedWords = new ArrayList<>();
        
        int i = 0;
        
        while(i < splitA.length) 
            if(hashset.contains(splitA[i])) 
               repeatedWords.add(splitA[i++]);
            
            else hashset.add(splitA[i++]);
            
        for(String word : repeatedWords) 
            hashset.remove(word);
        
        i = 0;        
        
        while(i < splitB.length) 
            if(hashset.contains(splitB[i])) 
               repeatedWords.add(splitB[i++]);
            else hashset.add(splitB[i++]);
        
        
        for(String word : repeatedWords) 
            hashset.remove(word);
        
        String[] answer = new String[hashset.size()];
        
        i = 0;
        
        for(String item : hashset) 
            answer[i++] = item;
        
        return answer;
    }
}
