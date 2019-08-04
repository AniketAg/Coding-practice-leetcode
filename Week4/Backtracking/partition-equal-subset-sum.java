class Solution 
{
    public boolean canPartition(int[] nums) 
    {
        int sum = 0;
	    for (int num :nums) 
        	sum += num;
	
	    if (sum % 2 == 1) return false;
	    
        boolean[][] dp = new boolean[nums.length + 1][sum / 2 + 1];
	    
        for (int i = 0; i < nums.length + 1; i++) 
		    dp[i][0] = true;
	    
	    for (int i = nums.length - 1; i >= 0; i--) 
    	for (int j = 1; j < sum / 2 + 1; j++) 
        {
			dp[i][j] = dp[i + 1][j];
			if (j >= nums[i]) 
            	dp[i][j] = (dp[i][j] || dp[i + 1][j - nums[i]]);
			
		}
	
	    return dp[0][sum / 2];
    }
}
