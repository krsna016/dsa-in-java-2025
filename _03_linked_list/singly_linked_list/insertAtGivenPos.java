package _03_linked_list.singly_linked_list;

public class insertAtGivenPos {

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

    public void insertAtAny(int data, int position) {

        ListNode newNode = new ListNode(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        int count = 0;
        ListNode current = head;
        while (count < position-2) {
            current = current.next;
            count++;
        }

        newNode.next = current.next;
        current.next = newNode;
    }


    public static void main(String[] args) {
        insertAtGivenPos sll = new insertAtGivenPos();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = forth;


        // Let index=0 be the 1st position
        sll.showEle();
        sll.insertAtAny(44,3);
        sll.showEle();
        sll.insertAtAny(11,1);
        sll.showEle();
    }
}