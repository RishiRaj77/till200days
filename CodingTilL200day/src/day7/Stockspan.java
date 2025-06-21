package day7;

import java.util.Iterator;
import java.util.Stack;

public class Stockspan {
	public static void main(String[] args) {
		int []price= {100, 80, 60, 70, 60, 75, 85};
		int [] span =calculateSpan(price);
	       
	        System.out.println("\nStock Spans: ");
	        for (int s : span) {
	            System.out.print(s + " ");
	        }
		
		
	}
	public static int [] calculateSpan(int []price) {
		int n=price.length;
		int []span = new int[n];
		Stack<Integer> stack=new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty()&& price[stack.peek()]<=price[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				span[i] = i + 1;
				
			} else {
				span[i]=i-stack.peek();
             
			}
			stack.push(i);
			
		}
		
		return span;
		
	}

}
