package _03_linked_list.singly_linked_list;

public class nthNodeFromEnd {

    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public int findNFromEnd(int n) {
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n) {
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr.data;
    }

    public static void main(String[] args) {
        nthNodeFromEnd sll = new nthNodeFromEnd();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        System.out.println(sll.findNFromEnd(3));
        System.out.println(sll.findNFromEnd(2));
        System.out.println(sll.findNFromEnd(1 ));
    }
}