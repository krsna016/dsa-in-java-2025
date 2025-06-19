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

    public int getLen() {
        int count = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public int findNFromEnd(int n) {
        int find = getLen() - n + 1;
        int count = 0;

        ListNode current = head;
        while (count != (find-1)) {
            current = current.next;
            count++;
        }
        return current.data;
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