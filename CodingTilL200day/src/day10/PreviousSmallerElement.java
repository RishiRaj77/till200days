package day10;

import java.util.Stack;

public class PreviousSmallerElement {
	public static void main(String[] args) {
		int []a= {3,1,0,8,6};
		int n=a.length;
		int[] result = new int[n];
		finder(a,result);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			
		}
		
	}
  public static void finder(int []a,int[] result) {
	  Stack<Integer>s=new Stack<>();
	  
	  for (int i = 0; i <a.length; i++) {
		  while (!s.isEmpty() && s.peek()>= a[i]) {
			  s.pop();
			
		}
		  if (s.isEmpty()) {
			  result[i]=-1;
			
		} else {
			result[i]=s.peek();

		}
		  s.push(a[i]);
		
	}
	
	  
  }

}
