class Solution 
{
    int maxNum;
    int maxSize;
    
    public List<List<Integer>> combine(int n, int k) 
    {
        if(n<k)
            return null;
        maxNum = n;
        maxSize = k;
        
        int[] buffer = new int[maxSize];
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        getCombinationsOfSizeK(result,buffer,1,0);
        
        return result;
    }

    private void getCombinationsOfSizeK(List<List<Integer>> result, int[] buffer , int numIndex , int bufferIndex)
    {
        if(bufferIndex == maxSize)
        {
            List<Integer> auxList = new ArrayList<Integer>();
		    for(int i = 0; i < buffer.length; i++)
			    auxList.add(buffer[i]);
		    result.add(auxList);
            return;
        }
    
        for(int i = numIndex; i <= maxNum; i++)
        {
            buffer[bufferIndex] = i;
            getCombinationsOfSizeK(result,buffer,i+1,bufferIndex+1);
        }
    
    }
}
