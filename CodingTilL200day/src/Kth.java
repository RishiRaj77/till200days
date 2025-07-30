import java.util.Arrays;

public class Kth {
	public static void main(String[] args) {
		int []a= {11,2,32,4,54};
		int k=2;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("the biggest " + a[a.length-k]);
	}

}
