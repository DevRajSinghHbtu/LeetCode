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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)
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
        int org = (int)Math.ceil((double)(length/2));
        ListNode node = head;
        for(int i = 1;i<org;i++)
        {
           node = node.next;
        }
        node.next = node.next.next;
        return head;
    }
}