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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null || (head.next == null && n == 1))
        {
            return null;
        }
        
        ListNode a = head;
        int length = 0;
        while(a != null)
        {
            length++;
            a = a.next;
        }
        if(length == n)
        {
            return head.next;
        }
           ListNode node = head;

          int skip = length - n;
          for(int i = 1; i<skip; i++)
          {
              node = node.next;
          }
          ListNode temp = node.next;
          node.next = temp.next;
          temp.next = null;
          return head;
    }
}