package day13;

public class FindTheMiddleOfLL {
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        Middle solution = new Middle();
        ListNode middle = solution.middleNode(head);

        System.out.println("Middle Node Value: " + middle.val);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class Middle {
    public ListNode middleNode(ListNode head) {
    	ListNode slow = head;
    	ListNode fast = head;
    	
    	while(fast!=null && fast.next!=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		
    	}
    	return slow;
    	
      
    }
}
