import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class duplicate {
 public static void main(String[] args) {
	 int []a= {11,2,2,32,4,54};
	 Arrays.sort(a);
	 for (int i = 0; i < a.length-1; i++) {
		if(a[i]==a[i+1]) {
			System.out.println(" duplicate is " +  a[i]);
		}
			}
}
}
