/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution 
{
    List<Integer> root1Leaves; 
    int leaveIdx;

    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        root1Leaves = new ArrayList<>();
        leaveIdx = 0;
        
        help(root1);
        leaveIdx = 0;
        
        return help(root2);
    }
    
    public boolean help(TreeNode cur) 
    {
        if (cur == null) 
            return true;
        
        if (cur.left == null && cur.right == null) 
        {
            if (leaveIdx == root1Leaves.size()) 
            {
                root1Leaves.add(cur.val);
                leaveIdx++;
                return true;
            } 
            else 
            {
                if (root1Leaves.get(leaveIdx++) == cur.val) 
                    return true;
                else return false;
            }
        }
        return help(cur.left) && help(cur.right);
    }
}
