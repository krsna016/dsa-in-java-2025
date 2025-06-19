package _03_linked_list.singly_linked_list;

public class insertInSortedList {

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

    public void insertInSorted(int data) {
        ListNode newNode = new ListNode(data);
        // Case 1: Insert at beginning or empty list
        if (head == null || data <= head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        // Case 2: Insert somewhere in the middle or end
        ListNode current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }


    public static void main(String[] args) {
        insertInSortedList sll = new insertInSortedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(40);
        ListNode forth = new ListNode(50);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        sll.insertInSorted(30);
        sll.insertInSorted(100);
        sll.printList();
    }
}