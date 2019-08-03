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
    int result = 0;
    public int sumOfLeftLeaves(TreeNode root) 
    {
        logic(root, false);
        return result;
    }
    
    public void logic(TreeNode root, boolean x)
    {
        if(root==null) return;
        else if(root.left == null && root.right == null && x==true)
          result = result + root.val;
        else
        {
           logic(root.right, false);
           logic(root.left, true);
        }
    }
    
}
