package _03_linked_list.singly_linked_list;

public class deleteLastNode {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void showEle() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public void deleteLast() {
        if (head == null || head.next == null) {
            return;
        }

//        ListNode current = head;
//        ListNode previous = null;
//        while (current.next != null) {
//            previous = current;
//            current = current.next;
//        }
//        previous.next = null;

        // Also,
        ListNode previous = head;
        while (previous.next.next != null) {
            previous = previous.next;
        }
        previous.next = null;
    }


    public static void main(String[] args) {
        deleteLastNode sll = new deleteLastNode();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        sll.showEle();
        sll.deleteLast();
        sll.showEle();
        sll.deleteLast();
        sll.showEle();

    }
}