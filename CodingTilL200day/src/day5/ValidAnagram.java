package day5;

import java.util.Arrays;

public class ValidAnagram {
	public static void main(String[] args) {
		String s1="li sten";
        String s2="silent";	
        if (isAnagram(s1,s2)) {
        	System.out.println("is a anagram");
			
		} else {
			System.out.println("is not a anagram");
		}
		
	}
	public static boolean isAnagram(String s1,String s2) {
		  // Normalize the strings: remove spaces and convert to lowercase
       s1 = s1.replaceAll("\\s", "").toLowerCase();
       s2 = s2.replaceAll("\\s", "").toLowerCase();
        
       if (s1.length()!=s2.length()) {
    	   return false;
			
		}   
		char[]chararr1=s1.toCharArray(); // char array sabko alag kar diya hai
		char[]chararr2=s2.toCharArray();
		
		Arrays.sort(chararr1);
		Arrays.sort(chararr2);
		
		return Arrays.equals(chararr1, chararr2);
	}
	

}
