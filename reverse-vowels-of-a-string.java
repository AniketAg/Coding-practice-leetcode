class Solution {
    public String reverseVowels(String s)     
    {
        char[] S = s.toCharArray();
        int i=0,j=S.length-1;
        char temp;
        while(i < j)
        {
            while(!check_vowel(S[i]) && i<j)  i++;
            while(!check_vowel(S[j]) && i<j)  j--;
            
            temp = S[i];
            S[i++] = S[j];
            S[j--] = temp;
        }
        return String.valueOf(S);
    }
    
    public boolean check_vowel(char c)
    {
        if(c=='A' || c =='a' ||c=='E' || c =='e' ||c=='I' || c =='i' ||c=='O' || c =='o' ||c=='U' || c =='u' ) 
            return true;
        return false;
    }
}

