package day13;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removingNTHnode {

    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0); // dummy node before head
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) return head; // n > list length
            fast = fast.next;
        }

        // Move both fast and slow pointers
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node
        slow.next = slow.next.next;

        return dummy.next; // return the head of the updated list
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        int n = 2; // remove the 2nd node from end (i.e., node with value 4)

        head = removeNthFromEnd(head, n);

        System.out.println("List after removing " + n + "th node from end:");
        printList(head);
    }
}
