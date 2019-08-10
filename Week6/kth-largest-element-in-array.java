class Solution {
    public int findKthLargest(int[] nums, int k) {
       
        int lo = nums[0]; 
        for(int i = 1; i < nums.length;i++) 
        if(nums[i] < lo) 
            lo = nums[i];
       
        int hi = nums[0]; 
        for(int i = 1; i < nums.length;i++) 
        if(nums[i] > hi) 
            hi = nums[i];
        
        int ans = -1;
        
        while(lo <= hi)
        {
            int countbig = 0,countequal = 0;
            int mid = lo + (hi - lo) / 2;
        
            for(int i = 0 ; i < nums.length ; i++)
            {
                if(nums[i] > mid)
                    countbig++;
                if(nums[i] == mid)
                    countequal++;
                if(countbig >= k)
                    break;
            }
            
            if(countbig < k && countbig + countequal >= k)
            {
                ans = mid;
                break;
            }
            else if(countbig >= k)
                    lo = mid + 1;
            else
                hi = mid - 1;
        
        }
        return ans;
    }
}
