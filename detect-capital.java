class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        int lower = 0; 
    
        for(char c: word.toCharArray())
             if(Character.isUpperCase(c))  upper++;
             else lower++;      
        
        if(upper == word.length() || lower == word.length() || (Character.isUpperCase(word.charAt(0))&&upper ==1))
            return true; 
        
        return false;   
    }
}
