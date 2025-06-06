package _03_linked_list.singly_linked_list;

public class creation {

    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        creation sll = new creation();

        sll.head = new ListNode(10); // First is the head node
        ListNode secondNode = new ListNode(20);
        ListNode thirdNode = new ListNode(30);
        ListNode forthNode = new ListNode(40);

        sll.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
    }
}