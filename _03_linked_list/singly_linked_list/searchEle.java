package _03_linked_list.singly_linked_list;

public class searchEle {

    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean searchElement(int data) {
        ListNode current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        searchEle sll = new searchEle();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        System.out.println(sll.searchElement(20));
        System.out.println(sll.searchElement(50));
    }
}