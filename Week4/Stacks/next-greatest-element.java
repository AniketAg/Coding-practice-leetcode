class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        if (nums1 == null || nums2 == null || nums2.length < nums1.length) return nums1;
        
        int[] res = new int[nums1.length];
        Map<Integer, Integer> m = new HashMap<>();
        
        for (int i = 0; i < nums1.length; i++) 
        {
            m.put(nums1[i], i);
            res[i] = -1;    // populate default next greater element
        }
        
        Stack<Integer> s = new Stack<>();
        for (int i = nums2.length-1; i >=0; i--) 
        {
           while (!s.isEmpty() && nums2[i] >= nums2[s.peek()])
                s.pop();
            
            if (m.containsKey(nums2[i])) 
            {
                if (!s.isEmpty()) 
                    res[m.get(nums2[i])] = nums2[s.peek()];
                else res[m.get(nums2[i])] = -1;
            }
           s.push(i);
        }
        return res;   
    }
}
