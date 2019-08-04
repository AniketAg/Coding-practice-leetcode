class Solution 
{
    public List<String> generateParenthesis(int n) 
    {
        List<String> result = new ArrayList<>();
        generateValidP(result, "", n, 0, 0);
        return result;
    }
    
    public void generateValidP(List<String> result, String validString, int n, int openCount, int closeCount) 
    {
        if(validString.length() == n * 2) 
            result.add(new String(validString));
        else 
        {
            if(openCount < n) 
                generateValidP(result, validString + "(", n, openCount + 1, closeCount);
            if(closeCount < n && closeCount < openCount)
                generateValidP(result, validString + ")", n, openCount, closeCount + 1);          
        }
    }
}
