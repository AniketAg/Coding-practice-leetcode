/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution 
{
    ArrayList<Integer> ans = new ArrayList<>();
    
    public List<Integer> postorder(Node root) 
    {
        generateArray(root);
        return ans;
    }
    
    private void generateArray(Node root)
    {
        if(root == null) return;
        
        for(int i = 0; i < root.children.size(); i ++)
            generateArray(root.children.get(i));
        
        ans.add(root.val);
    }
}
