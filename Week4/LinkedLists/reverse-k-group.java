/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
    ListNode c = head;
    int count = 0;                                                     
    
    while(c != null) 
    {
      count++;
      c = c.next;  
    }    
       
     return reverseHelper(k, head, count);   
    }
    
    private ListNode reverseHelper(int k, ListNode curr, int count) 
    {
       if(curr == null) 
           return null;
       
       if(k > count) 
           return curr;
       
       int c = 0;
       ListNode temp = null;
       ListNode first = null; 
       ListNode prev = null; 
            
       while(c < k & curr != null) 
       {
            if(first == null) 
                first = curr;
                
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;  
            count--;    
            c++;    
       }
        first.next = reverseHelper(k, curr, count);
        return prev;
    }
}
