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

    public void findMidEle() {
        ListNode jumpZero = head;
        ListNode jumpOne = head;
        while (jumpOne != null) {
            jumpOne = jumpOne.next.next;
            jumpZero = jumpZero.next;
        }
    }

    public static void main(String[] args) {

    }
}