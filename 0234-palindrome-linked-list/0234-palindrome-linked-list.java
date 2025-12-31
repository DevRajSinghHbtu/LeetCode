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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);
        ListNode revHead = reverseList(mid);
        ListNode temp = revHead;
        while(head != null && revHead != null)
        {
            if(head.val != revHead.val)
            {
                break;
            }
            
            head = head.next;
            revHead = revHead.next;
        }
        reverseList(temp);
        if(head == null || revHead == null)
        return true;
        return false;
    }
    public ListNode reverseList(ListNode head) {
       if(head == null)
       return head;
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;
        while(pres != null)
        {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null)
            {
               next = next.next;
            }
        }
        return prev;
    }
    public ListNode findMid(ListNode head)
    {
       
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
}