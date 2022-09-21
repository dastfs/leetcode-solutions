package Medium;

//#19
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        start.next = head;


        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;
      }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
