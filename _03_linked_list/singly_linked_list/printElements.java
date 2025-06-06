package _03_linked_list.singly_linked_list;

public class printElements {

    private ListNode head;

    public static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printTheElem(ListNode head) {
        ListNode current = head;
        while (current != null) { // means loop till current = length of linkedList(including null) - 1
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        printElements sll = new printElements();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = null;

        printTheElem(sll.head);
    }
}