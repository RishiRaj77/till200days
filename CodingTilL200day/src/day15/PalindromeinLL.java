package day15;

public class PalindromeinLL {

    // Your ListNode definition
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

    // Your Solution class unchanged
    public static class Solution {
        public ListNode reverse(ListNode head) {
            ListNode curr = head;
            ListNode prev = null;
            ListNode after = null;
            while (curr != null) {
                after = curr.next;
                curr.next = prev;
                prev = curr;
                curr = after;
            }
            return prev;
        }

        public boolean isPalindrome(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode temp = reverse(slow.next);
            slow.next = temp;
            ListNode p1 = head;
            ListNode p2 = slow.next;
            while (p2 != null) {
                if (p1.val != p2.val) return false;
                p1 = p1.next;
                p2 = p2.next;
            }
            return true;
        }
    }

    // Helper to create a list from array
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode curr = head;
        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 2, 1};  // Change this input to test
        ListNode head = createList(input);

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(head);
        System.out.println("Is palindrome? " + result);
    }
}
