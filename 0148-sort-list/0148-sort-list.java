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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        return head;
     ListNode midprev = findMiddle(head);
       ListNode right = midprev.next;
       midprev.next = null;

     ListNode left = sortList(head);
             right = sortList(right);
     return merge(left, right);
    }
    public ListNode merge(ListNode first, ListNode second)
    {
        ListNode ans = new ListNode();
        ListNode temp = ans;
      while(first != null && second != null)
      {
        if(first.val < second.val)
        {
            temp.next = first;
            first = first.next;
            temp = temp.next;
        }
        else
        {
            temp.next = second;
            second = second.next;
            temp = temp.next;
        }
      }
      while(first != null)
      {
        temp.next = first;
            first = first.next;
            temp = temp.next;
      }
      while(second != null)
      {
        temp.next = second;
            second = second.next;
            temp = temp.next;
      }
      return ans.next;
    }
    public ListNode findMiddle(ListNode head)
    {
       ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
         while(fast != null && fast.next != null)
        {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
            
        }
        return prev;
    }
}