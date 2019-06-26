class Solution {
    public String reverseWords(String s) 
    {
        StringBuilder sbd = new StringBuilder();
    	String[] S = s.split(" ");
	    for (String str: S) 
		    sbd.append(reverseWord(str)).append(" ");
	
    	return sbd.toString().trim();
    }

private String reverseWord(String str) {
	char[] v = str.toCharArray();
	int a = v.length;
    for(int i=0;i<v.length/2;i++)
    {
        char temp = v[i];
        v[i] = v[a-1];
        v[a-1] = temp;a--;
    }
    String p = String.copyValueOf(v);
    return p;
  
}
    
} 
