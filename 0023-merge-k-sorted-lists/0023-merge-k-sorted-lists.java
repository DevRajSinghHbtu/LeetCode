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
    public ListNode mergeKLists(ListNode[] lists) {
         if(lists == null || lists.length == 0) return null;
        ListNode ans = lists[0];
        for(int i = 1; i<lists.length; i++){
           ans = merge(ans, lists[i]);
        }
        return ans;

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
}