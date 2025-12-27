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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        {
           return head;
        }
        else
        {
                ListNode node = head;
        while(node.next != null)
        {
            if(node.val == node.next.val)
            {
                if(node.next.next != null)
                {
                    node.next = node.next.next;
                }
                else
                {
                    node.next = null;
                }
            }
            else
            {
                node = node.next;
            }
        }
        return head;
        }
       
    }
}