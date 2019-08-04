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
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
     {
        if(l1==null){return l2;}
        if(l2==null){return  l1;}
        if(l1.val>l2.val)
        {
            ListNode tmp=l1;
            l1=l2;
            l2=tmp;
        }
        
        ListNode head=l1;
        while (l2!=null)
            if(l1.next==null)
            {
                l1.next=l2;
                break;
            }
            else
            {
                if(l1.val<=l2.val&&l2.val<=l1.next.val)
                {
                    ListNode next=l1.next;
                    l1.next=new ListNode(l2.val);
                    l1.next.next=next;
                    l2=l2.next;
                }
                else l1=l1.next;
            } 
        return head;
    }
    
    public ListNode mergeKLists(ListNode[] lists) 
    {
        if(lists.length==0){return null;}
        
        int len=(lists.length+1)/2;int relen=lists.length;
        
        while (len>0)
        {
            for(int i=0;i<len;i++)
                if(i+len<relen)
                     lists[i]=mergeTwoLists(lists[i],lists[i+len]);
            relen=len;
            len=(len==1)?0:(len+1)/2;
        }
        return lists[0];
    }
}
