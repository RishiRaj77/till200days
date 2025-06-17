package day1;

import java.util.Scanner;

public class Palindrome {
	public static boolean ispalindrome(String s) {
		int start = 0; 
		int end = s.length() - 1;
		
		while (start<=end) {
			if (s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end --;
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" enter the string ");
		String givenStr = scanner.nextLine();
		if (ispalindrome(givenStr)) {
			System.out.println(" palindromee");
		}
			
		else {
			System.out.println(" not palindrome");

		}
	}
}



