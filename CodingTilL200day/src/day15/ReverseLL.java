package day15;


public class ReverseLL {

    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Your class exactly as given
    public static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode current = head;
            ListNode prev = null;
            ListNode agla = null;

            while (current != null) {
                agla = current.next;
                current.next = prev;
                prev = current;
                current = agla;
            }
            return prev;
        }
    }

    // Helper: create linked list from array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Helper: print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5}; // Example list
        ListNode head = createList(input);

        Solution sol = new Solution();
        ListNode reversed = sol.reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversed);
    }
}
