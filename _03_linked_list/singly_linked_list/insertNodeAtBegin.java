package _03_linked_list.singly_linked_list;

public class insertNodeAtBegin {

    private ListNode head;
    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printEle() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addNodeAtBegin(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        insertNodeAtBegin sll = new insertNodeAtBegin();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = forth;
        // By-default the next of ListNode named forth is null

        sll.addNodeAtBegin(60); // Hence we can use head directly inside the method
        sll.addNodeAtBegin(70); // Hence we can use head directly inside the method
        sll.addNodeAtBegin(90); // Hence we can use head directly inside the method
        sll.addNodeAtBegin(100); // Hence we can use head directly inside the method

        sll.printEle();
    }
}