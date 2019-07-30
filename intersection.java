class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
 
        HashSet < Integer > set = new HashSet < > ();
        for (int i=0; i<nums1.length; i++) 
        {
            for (int j = 0; j < nums2.length;j++)
                if(nums1[i]==nums2[j])  
                    set.add(nums2[j]);
        }
        int[] array = new int[set.size()];

        int k = 0;
        for (int i: set)
	        array[k++] = i;
        
        return array;
    }
}
 
