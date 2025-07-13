package day14;

public class Mergetwosortedarray {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode merge(ListNode head1, ListNode head2) {
        ListNode temp1 = head1;
        ListNode temp2 = head2;

        ListNode head = new ListNode(0); // dummy node
        ListNode temp = head;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                ListNode a = new ListNode(temp1.val);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                ListNode a = new ListNode(temp2.val);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }

        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }

        return head.next;
    }

    public static void main(String[] args) {
        // Example input
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);

        ListNode result = merge(head1, head2);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
