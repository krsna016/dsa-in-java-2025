package _03_linked_list.singly_linked_list;

public class mergeTwoSorted {

    private ListNode head1;
    private ListNode head2;

    public static class ListNode {
        private ListNode next;
        private int data;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void showEle(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode mergeTwoList() {
        return null;
    }

    public static void main(String[] args){
        mergeTwoSorted sll = new mergeTwoSorted();
        sll.head1 = new ListNode(10);
        ListNode second1 = new ListNode(20);
        ListNode third1 = new ListNode(30);
        ListNode forth1 = new ListNode(40);
        ListNode fifth1 = new ListNode(50);


        sll.head2 = new ListNode(15);
        ListNode second2 = new ListNode(42);
        ListNode third2 = new ListNode(35);
        ListNode forth2 = new ListNode(60);
        ListNode fifth2 = new ListNode(80);

        sll.head1.next = second1;
        second1.next = third1;
        third1.next = forth1;
        forth1.next = fifth1;

        sll.showEle(sll.head1);

        sll.head2.next = second2;
        second2.next = third2;
        third2.next = forth2;
        forth2.next = fifth2;

        sll.showEle(sll.head2);

        ListNode newHead = sll.mergeTwoList();
        sll.showEle(newHead);
    }
}