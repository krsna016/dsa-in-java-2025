package _03_linked_list.singly_linked_list;

public class removeKey {

    private ListNode head;
    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void removeTheKey(int key) {
        if (head == null) return;
        // Case 1: key is at head
        if (head.data == key) {
            head = head.next;
            return;
        }
        // Case 2: key is elsewhere
        ListNode current = head;
        ListNode prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        // If key not found
        if (current == null) return;
        // Bypass the node
        prev.next = current.next;
    }

    public static void main(String[] args) {
        removeKey sll = new removeKey();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(60);
        ListNode third = new ListNode(80);
        ListNode forth = new ListNode(90);
        ListNode fifth = new ListNode(15);

        sll.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        sll.printList();
        sll.removeTheKey(10);
        sll.printList();
    }
}