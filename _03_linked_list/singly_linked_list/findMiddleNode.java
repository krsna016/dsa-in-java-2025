package _03_linked_list.singly_linked_list;

public class findMiddleNode {

    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int findMidEle() {
        ListNode jumpZero = head;
        ListNode jumpOne = head;
        while (jumpOne != null && jumpOne.next != null) {
            jumpOne = jumpOne.next.next;
            jumpZero = jumpZero.next;
        }
        return jumpZero.data;
    }

    public static void main(String[] args) {
        findMiddleNode sll = new findMiddleNode();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        sll.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        System.out.println(sll.findMidEle());

    }
}