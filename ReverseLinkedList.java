public class ReverseLinkedList {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode reverseList(ListNode h) {
        if (h == null) return null;
        // print(h);
        ListNode head = h;
        ListNode ret = new ListNode(head.val);
        while (head.next != null) {
            head = head.next;
            ret = new ListNode(head.val, ret);
            // print(ret);
        }
        return ret;
    }
    public void print(ListNode n) {
        if (n == null) return;
        ListNode t = n;
        String str = "";
        while (t.next != null) {
            str += t.val;
            t = t.next;
        }
        str += t.val;
        System.out.println(str);
    }
}
