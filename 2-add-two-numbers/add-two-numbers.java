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
        // Dummy node to build the resulting list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            // Create a new node with the digit value of sum
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the sum list starting from the next of dummy node
        return dummyHead.next;
    }
}
