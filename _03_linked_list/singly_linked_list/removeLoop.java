package _03_linked_list.singly_linked_list;

public class removeLoop {
    private ListNode head;
    public static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void removeTheLoop() {
        ListNode previous = getTheLoop(); // This is last node of the loop i.e. just previous to the start of the loop
        previous.next = null;
    }

    public ListNode startOfLoop(ListNode slowPtr) {
        ListNode temp = head;
        while (slowPtr.next != temp.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp; // This is last node of the loop
    }

    public ListNode getTheLoop() {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                return startOfLoop(slowPtr);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        removeLoop sll = new removeLoop();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        sll.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = third;

        sll.removeTheLoop();
    }
}