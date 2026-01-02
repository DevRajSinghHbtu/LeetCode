/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        int la = 0;
        while(a != null)
        {
            la++;
            a = a.next;
        }
        ListNode b = headB;
       
        int lb = 0;
         while(b != null)
        {
            lb++;
            b = b.next;
        }
         ListNode sA = headA;
           ListNode sB = headB;
        if(la > lb)
        {
          
          
           int skipA = la-lb;
            for(int i = 1;i<=skipA;i++)
            {
                sA = sA.next;
            }
            
        }
        else if(lb > la)
        {
          
           int skipB = lb-la;
            for(int i = 1;i<=skipB;i++)
            {
                sB = sB.next;
            }
        }
        
           
            while(sB != sA) 
            {
                sB = sB.next;
                sA = sA.next;
            }
          
           return sB;

    }
}