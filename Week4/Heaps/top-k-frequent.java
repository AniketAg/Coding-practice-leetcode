class Solution 
{
    public List<Integer> topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>();
	    
        for(int i = 0; i < nums.length ; i++)
		    map.put(nums[i], map.containsKey(nums[i]) ? map.get(nums[i]) + 1 : 1);
	    	
	    List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
	    
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
                            {
                                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) 
                                {
			                        return o2.getValue().compareTo(o1.getValue());
	                        	}   
	                        }
                        );
	
	    List<Integer> res = new ArrayList<>();
	    for (int i = 0; i < k; i++)
		    res.add((Integer) list.get(i).getKey());
	    return res;
    }
}
