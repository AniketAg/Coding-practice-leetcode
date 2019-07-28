class Solution {
    public int numJewelsInStones(String J, String S) 
    {
        char sArray[] = S.toCharArray();
        char jArray[] = J.toCharArray();
        int count = 0;
        for(int i = 0; i<sArray.length; i++ )
            for(int j = 0; j<jArray.length;j++)
            {
                if(sArray[i]==jArray[j])
                    count++;
            }
        return count;
    }
}
