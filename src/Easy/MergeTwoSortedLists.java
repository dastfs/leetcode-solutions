package Easy;
//#21
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        System.out.println(mergeTwoLists(l1,l2));

//        Input: l1 = [1,2,4], l2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        //ListNode tail = null;

        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        while(l1 != null){

            ListNode temp = null;
            if(l2 == null){
                temp = l1;
                l1 = l1.next;
            } else if (l1.val < l2.val){
                temp = l1;
                l1 = l1.next;
            } else {
                temp = l2;
                l2 = l2.next;
            }

            if(head == null){
                head = temp;
                head.next = null;
            } else {
                head.next = temp;
                head.next.next = null;
            }


        }


        return head;
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode resultHead = null;
        ListNode resultTail = null;

        while (l1 != null || l2 != null) {
            ListNode smallestNode = null;
            if (l2 == null || (l1 != null && l1.val < l2.val)) {
                smallestNode = l1;
                l1 = l1.next;
            } else {
                smallestNode = l2;
                l2 = l2.next;
            }

            if (resultHead == null) {
                resultHead = smallestNode;
            } else {
                resultTail.next = smallestNode;
            }

            resultTail = smallestNode;
            resultTail.next = null;
        }

        return resultHead;
    }

}
