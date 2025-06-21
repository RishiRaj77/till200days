package day6;
import java.util.Stack;

public class Reverseofstrusingstack {
	public static void main(String[] args) {
		String s="hello";
		String r="";
		System.out.println(rev(s));
	}
		
public static String rev(String s) {
	Stack<Character>stack=new Stack<>();
	
	for (char i :s.toCharArray()) {
		stack.push(i);
		
	}
	return s;
	

		}
	

}
