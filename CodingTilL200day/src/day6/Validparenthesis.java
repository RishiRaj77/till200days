package day6;
import java.util.Iterator;
import java.util.Stack;


public class Validparenthesis {
	public static void main(String[] args) {
		String s="(()))";
		System.out.println(check(s));
	}
	public static boolean check (String s) {
		Stack<Character> stack = new Stack<>();
		for (char i: s.toCharArray()) {
			if (i =='(') {
				stack.push(i);
				
			}
			else if(i==')') {
				if (stack.empty() || stack.pop()!='(') {
					return false;
					
				}
				
			}
			
		}
		return stack.isEmpty();
		
	}

}
