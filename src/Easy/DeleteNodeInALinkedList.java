package Easy;

//#237
public class DeleteNodeInALinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode l = this;
        while(l != null){
            stringBuilder.append(l.val);
            stringBuilder.append(", ");
            l = l.next;
        }
        return stringBuilder.toString();
    }
}
