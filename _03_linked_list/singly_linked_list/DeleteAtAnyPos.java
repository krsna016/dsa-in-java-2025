package _03_linked_list.singly_linked_list;

public class DeleteAtAnyPos {

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

    public void delAnyPos(int position) {

        if (position == 1) {
            head = head.next;
            return;
        }

        int count = 0;
        ListNode current = head;
        while (count < position-2) {
            current = current.next;
            count++;
        }
        current.next.next = null;
        current.next = current.next.next;
    }

    public static void main(String[] args) {
        DeleteAtAnyPos sll = new DeleteAtAnyPos();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        // Lets index = 0 be the 1st Position
        sll.printEle();
        sll.delAnyPos(3);
        sll.printEle();
        sll.delAnyPos(1);
        sll.printEle();
        sll.delAnyPos(1);
        sll.printEle();
    }
}