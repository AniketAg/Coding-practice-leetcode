class Solution {
    public boolean wordPattern(String pattern, String str) {

    String[] strs = str.split(" ");

    if (pattern.length() != strs.length) 
        return false;

    Map<Character, String> pToS = new HashMap<>();
    Map<String, Character> sToP = new HashMap<>();
    
    int n = pattern.length();
    char[] cs = pattern.toCharArray();
    
    for (int i = 0; i < n; ++i) 
    if (pToS.containsKey(cs[i]) && !pToS.get(cs[i]).equals(strs[i]) || sToP.containsKey(strs[i]) && sToP.get(strs[i]) != cs[i] || pToS.containsKey(cs[i]) ^ sToP.containsKey(strs[i])) 
        return false;
    else 
    {
      sToP.put(strs[i], cs[i]);
      pToS.put(cs[i], strs[i]);
    }
    
        return true;
     
    }
}
