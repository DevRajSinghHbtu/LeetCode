/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int c = 0;
        while(l1 != null && l2 != null)
        {
            int a = l1.val + l2.val + c;
            int b = a%10;
            c = a/10;
            ListNode temp = new ListNode(b);
            if(head == null)
            {
                head = temp;
                tail = temp; 
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null)
        {
            int a = l1.val + c;
            int b = a%10;
            c = a/10;
             ListNode temp = new ListNode(b);
              if(head == null)
            {
                head = temp;
                tail = temp; 
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }
            l1 = l1.next;
        }
        while(l2 != null)
        {
            int a = l2.val + c;
            int b = a%10;
            c = a/10;
             ListNode temp = new ListNode(b);
              if(head == null)
            {
                head = temp;
                tail = temp; 
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }
            l2 = l2.next;
        }
        if(c != 0)
        {
           ListNode temp = new ListNode(c); 
            tail.next = temp;
                tail = temp;
        }
        return head;
    }
}