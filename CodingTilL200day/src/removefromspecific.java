import java.util.Arrays;

public class removefromspecific {
	public static void main(String[] args) {
		int []a= {11,2,2,32,4,54};
        int []b =new int[a.length-1];

        int pos=2;
        for(int i = 0;i<pos;i++) {
       	 b[i]=a[i]; 
        }
        for(int i = pos+1;i<a.length;i++) {
       	 b[i-1]=a[i]; 
        }
        System.out.println(Arrays.toString(b));
	}

}
