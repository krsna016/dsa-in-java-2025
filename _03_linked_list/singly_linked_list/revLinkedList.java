package _03_linked_list.singly_linked_list;

public class revLinkedList {

    private ListNode head;
    public static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void reverseList() {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.next;

        while (true) {
            current.next = previous;

        }
    }

    public static void main(String[] args) {

    }
}