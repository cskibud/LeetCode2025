public class MiddleLinkedList {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    class Solution {
        public ListNode middleNode(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return head;
            ListNode first = head;
            ListNode second = head;
            int count = 0;
            while (first.next != null) {
                if (count % 2 == 0) {
                    first = first.next;
                    second = second.next;
                } else {
                    first = first.next;
                }
                count++;
            }
            return second;
        }
    }
}
