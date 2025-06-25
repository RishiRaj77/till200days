package day11;

public class Lengthof2ndword {
	public static void main(String[] args) {
		String s="hello World";
		int len=0;
		for (int i = s.length()-1; i >=0; i--) {
			if (s.charAt(i)== ' ') {
				break;
				
			}
			len++;
			
		}
		System.out.println(len);
		
	}

}
