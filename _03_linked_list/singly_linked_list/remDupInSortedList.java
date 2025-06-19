package _03_linked_list.singly_linked_list;

public class remDupInSortedList {

    private ListNode head;
    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void removeDuplicate() {
        ListNode current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                ListNode temp = current.next;
                current.next = current.next.next;
                temp.next = null;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        remDupInSortedList sll = new remDupInSortedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(30);
        ListNode fifth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        sll.removeDuplicate();
    }
}