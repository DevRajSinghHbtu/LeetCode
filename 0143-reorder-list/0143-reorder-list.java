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
    public void reorderList(ListNode head) {
        ListNode mid = findMid(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;

        while(hf != null && hs != null)
        {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs =temp;
        }

        if(hf != null)
        {
            hf.next = null;
        }
    }
    public ListNode findMid(ListNode head)
    {
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null)
        {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode reverseList(ListNode head)
    {
        if(head == null || head.next == null)
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
        return  prev;
    }
}