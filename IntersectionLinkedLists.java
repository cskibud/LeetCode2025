public class IntersectionLinkedLists {
    
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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            // if (a == null) a = headB;
            // else {a = a.next;}
            // if (a == null) a = headB;
            // else {a = a.next;}
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    // find lengths first
    // eww don't look

    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     if (headA == null || headB == null) return null;
    //     if (headA == headB) return headA;
    //     ListNode tempA = headA;
    //     ListNode tempB = headB;
    //     int lengthA = 0;
    //     int lengthB = 0;
    //     while (tempA.next != null) {
    //         lengthA++;
    //         tempA = tempA.next;
    //     }
    //     while (tempB.next != null) {
    //         lengthB++;
    //         tempB = tempB.next;
    //     }
    //     int distance = Math.abs(lengthA - lengthB);
    //     System.out.println(distance);
    //     if (distance == 0) {
    //         while (headA.next != null) {
    //             headA = headA.next;
    //             headB = headB.next;
    //             if (headA == headB) return headA;
    //         }
    //         return null;
    //     }
    //     ListNode first;
    //     ListNode second = null;
    //     boolean a = false;
    //     if (lengthA > lengthB) {
    //         first = headA;
    //         a = true;
    //     } else {
    //         first = headB;
    //     }
    //     while (first.next != null) {
    //         distance--;
    //         first = first.next;
    //         System.out.println("fir: " + first.val);
    //         if (distance <= 0) {
    //             if (second == null) {
    //                 if (a) second = headB;
    //                 else {second = headA;}
    //                 System.out.println(second.val);
    //             }
    //             else {
    //                 System.out.println(second.val);
    //                 second = second.next;
    //             }
    //         }
    //         if (first == second) {
    //             return first;
    //         }
    //     }
    //     return null;
    // }
}
}
