package day13;

public class IntersectionOF2linklist {
    public static void main(String[] args) {
     
        // Shared part
        ListNode intersectNode = new ListNode(8);
        intersectNode.next = new ListNode(9);

        // List A
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = intersectNode;

        // List B
        ListNode headB = new ListNode(3);
        headB.next = intersectNode;

        Solution solution = new Solution();
        ListNode result = solution.getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection Node: " + result.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}


class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}


class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode tempA=headA;
    	ListNode tempB=headB;
    	
    	int lengthA=0;
    	while (tempA!=null) {
    		lengthA ++;
    		tempA =tempA.next;
    	}
    	
    	int lengthB=0;
    	while (tempB!=null) {
    		lengthB ++;
    		tempB =tempB.next;
    	}
    	
    	tempA = headA;
    	tempB = headB;
    	
    	if (lengthA > lengthB) {
    		int steps = lengthA - lengthB;
    		for (int i = 0; i < steps; i++) {
    			tempA = tempA.next;	
			}
			
		} else {
			int steps = lengthB - lengthA;
    		for (int i = 0; i < steps; i++) {
    			tempB = tempB.next;	
			}

		}
    	
    	while (tempA != tempB) {
    		tempA = tempA.next;	
    		tempB = tempB.next;
    		
			
		}
    	return tempA;
    	
    		
			
		}
      
    }

