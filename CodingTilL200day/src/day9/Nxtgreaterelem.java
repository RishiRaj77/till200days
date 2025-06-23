package day9;

import java.util.Stack;

public class Nxtgreaterelem {
	public static void main(String[] args) {
		int []a= {6,8,0,1,3};
		int n=a.length;
		int[] result = new int[n];
		finder(a,result);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			
		}
		
	}
  public static void finder(int []a,int[] result) {
	  Stack<Integer>s=new Stack<>();
	  
	  for (int i = a.length-1; i >=0; i--) {
		  while (!s.isEmpty() && s.peek()<=a[i]) {
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
