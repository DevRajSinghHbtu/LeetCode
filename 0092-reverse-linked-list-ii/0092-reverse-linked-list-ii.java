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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right)
        return head;

         // in this part we will iterate to the left node
        ListNode prev = null;
        ListNode current = head;
        for(int i = 0; i<left - 1 && current != null; i++)
        {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        // now reversing will be done
        ListNode next = current.next;
        for(int i = 0;i< right - left +1; i++)
        {
              current.next = prev;
              prev = current;
              current = next;
              if(next != null)
              {
                next = next.next;
              }
        }
        
        if(last != null)
        {
             last.next = prev;
        }
        else
        {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
}