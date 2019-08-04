/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
    
    ListNode prev = null;
    
    while (head != null) 
    {
        ListNode nextTemp = head.next;
        head.next = prev;
        prev = head;
        head = nextTemp;
    }
    
        return prev;
    
    }
}
