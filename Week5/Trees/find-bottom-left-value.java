/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) 
    {
       return helper(root, 0, new int[] {0,root.val});
    }
    
    private int helper(TreeNode curr, int row, int[] leftMost)
    {
        if (row > leftMost[0]) // if current row is greater than max depth so far
        {
            leftMost[0] = row; // max depth = current row
            leftMost[1] = curr.val; // set new value
        }
        if (curr.left != null)
            helper(curr.left, row + 1, leftMost);
        if (curr.right != null)
            helper(curr.right, row + 1, leftMost);
        
        return leftMost[1]; // return the leftmost val found so far
    }
}
