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

    public void insertInSorted(int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        while(current != null) {
            if (newNode.data <= current.data) {
                newNode.next = current;
                head = newNode;
                return;
            } else if (newNode.data > current.data && newNode.data < current.next.data) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
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
    }
}