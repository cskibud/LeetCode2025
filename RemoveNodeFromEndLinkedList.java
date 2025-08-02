public class RemoveNodeFromEndLinkedList {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null)
                return null;
            if (head.next == null) {
                return null;
            }
            ListNode first = head;
            ListNode follow = null;
            int count = 0;
            while (first.next != null) {
                first = first.next;
                count++;
                if (count >= n) {
                    if (follow == null) {
                        follow = head;
                    } else {
                        follow = follow.next;
                    }
                }
                // System.out.println("first: " + first.val);
                // if (follow != null)
                // System.out.println(" - " + follow.val);
            }
            if (follow == null) {
                return head.next;
            }
            follow.next = follow.next.next;
            return head;
        }
    }
}