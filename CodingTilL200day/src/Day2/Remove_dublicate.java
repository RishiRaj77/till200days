package Day2;
import java.util.Iterator;

public class Remove_dublicate {
	public static void main(String[] args) {
		int a[]= {1,2,2,3,3,4};
		int n= a.length;
		
		System.out.println( duplicate(a,n));
		
		
	}

static int duplicate(int a[],int n) {
		int uq =1;
		for (int i = 1; i < n; i++) {
			if (a[i]!=a[i-1]) {
				a[uq]=a[i];
				uq++;
				
				
			}
			
			
			
		}
		return uq;
	
		

	}
}
