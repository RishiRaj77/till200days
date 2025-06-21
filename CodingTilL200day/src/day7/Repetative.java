package day7;

public class Repetative {
	public static void main(String[] args) {
		String s="rishi";
		char[]c=s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			int count=0;
			for (int j = i+1; j < c.length; j++) {
				if (c[i]==c[j]) {
					count++;
					
				}
				
			}
			if (count>0) {
				System.out.println(c[i]);
				
			}
		}
		
		
	}

}
