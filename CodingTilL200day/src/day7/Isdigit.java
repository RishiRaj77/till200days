package day7;

import java.util.Iterator;

public class Isdigit {
	public static boolean main(String[] args) {
		String s="123";
		boolean isdigit;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				isdigit=true;
			}
			else {
				isdigit=false;
				break;
			}
			if (isdigit) {
				System.out.println("yes");
			} else {
            System.out.println("no");
			}
			
		}
		return false;
		
	}

}
