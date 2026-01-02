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
    public ListNode oddEvenList(ListNode head) {
         // Edge case: If list is empty or has only one node
        if (head == null || head.next == null) return head;

        // Create pointers for the heads and tails of even and odd lists
        ListNode evenHead = null, evenTail = null;
        ListNode oddHead = null, oddTail = null;

        // Pointer to traverse the list
        ListNode current = head;
         int length = 0;
        // Traverse the linked list
        while (current != null) {
             length++;
            // If the current node has even value
            if (length % 2 == 0) {

                // First even node
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }

            } else {
                // If the current node has odd value

                // First odd node
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            }

            // Move to next node
            current = current.next;
        }

      

        // Combine even and odd lists
        oddTail.next = evenHead;

        // Set end of list to null
        evenTail.next = null;

        return oddHead;
    
    }
}