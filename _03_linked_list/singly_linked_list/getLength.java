package _03_linked_list.singly_linked_list;

public class getLength {

    private ListNode head;

    public static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int printThelen(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        getLength sll = new getLength();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = null;

        System.out.println("Length is : " +  printThelen(sll.head));
    }
}