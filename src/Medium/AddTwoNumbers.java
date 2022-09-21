package Medium;

import Medium.RemoveNthFromEnd.ListNode;

import java.util.HashSet;
import java.util.Set;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);

        node2.next = node3;
        System.out.println(addTwoNumbers(node1, node2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int i = 0;
        int j = 0;
        ListNode dummy = new ListNode();
        ListNode curr = new ListNode();
        dummy = curr;
        Set<Integer> set = new HashSet<>();
        

        while(l1 != null || l2 != null){
            i = (l1 != null) ? l1.val : 0;
            j = (l2 != null) ? l2.val : 0;
            int sum = i + j + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry > 0)
            curr.next = new ListNode(carry);

        return dummy.next;
    }
}
