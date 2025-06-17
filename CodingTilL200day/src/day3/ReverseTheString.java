package day3;
import java.util.*;

public class ReverseTheString {
	public static void main(String[] args) {
		String s="hello";
		String rev=revstr(s);
		System.out.println(rev);
	}
	
public static String revstr(String s) {
	char []chararr=s.toCharArray();
	int left=0;
	int right=chararr.length-1;
	
	while(left<right) {
		
		
		char temp=chararr[left];
		chararr[left]=chararr[right];
		chararr[right]=temp;
		
		right--;
		left++;
	}
	return new String(chararr);
	
}
}
