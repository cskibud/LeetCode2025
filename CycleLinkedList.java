public class CycleLinkedList {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null) return false;
            ListNode first = head;
            ListNode second = head;
            while (first != null && first.next != null) {
                first = first.next.next;
                second = second.next;
                if (first == second) return true;
            }
            return false;
        }
    }
}
