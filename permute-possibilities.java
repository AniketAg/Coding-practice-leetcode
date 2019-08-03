class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result, new ArrayList<>());
        return result;
    }

    public void permute(int[] nums, int index, List<List<Integer>> result, List<Integer> curr) 
    {
        if (index == nums.length - 1) 
        {
            curr.add(nums[index]);
            result.add(curr);
            return;
        }

        for (int i = index; i < nums.length; i++) 
        {
            int[] copy = nums.clone();
            if (i != index) 
            {
                copy[index] = copy[i] + copy[index];
                copy[i] = copy[index] - copy[i];
                copy[index] = copy[index] - copy[i];
            }
			
			List<Integer> currPerm = new ArrayList<>(curr);
            currPerm.add(copy[index]);
            permute(copy, index + 1, result, currPerm);
        }
    }
}
