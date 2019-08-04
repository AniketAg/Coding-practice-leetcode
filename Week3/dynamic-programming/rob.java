class Solution 
{
    public int rob(int[] nums) 
    {
        if (nums.length == 0) 
            return 0;
        
        if (nums.length == 1) 
            return nums[0]; 

        //rob form 0 to len-1 or 1 to len will not collide
        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }

    public int rob(int[] nums, int start, int end) 
    {
        if (start == end) 
            return 0; 
        if (end - start == 1) 
            return nums[start];

        //make dp array
        int[] dp = new int[end - start];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        
        for (int i = 2; i < end - start; i++) 
            dp[i] = Math.max(dp[i - 2] + nums[start + i], dp[i - 1]);
        
        //the last number is max
        return dp[dp.length - 1];    
    }
}
