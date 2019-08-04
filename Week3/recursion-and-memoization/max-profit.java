class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        
        if(n == 0) return 0;
        
        int min = prices[0], res = 0;
        
        for(int i=0; i<n; i++)
        {
            min = Math.min(min, prices[i]);
            res = Math.max(res, prices[i]-min);
        }
        return res;
    }
}
