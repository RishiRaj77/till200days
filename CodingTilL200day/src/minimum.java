public class minimum {
    public static void main(String[] args) {
		int []a= {11,2,32,4,54};
		int min =a[0];
		int min2=a[0];
		int max=a[0];
		int max2=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(min>a[i]) {
				min2 =min;
				min=a[i];
			}
			else if (a[i]<min2 && min2!=min) {
				min2=a[i];
			
		}
			
			
		}
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max2=max;
				max=a[i];
			}
			else if (a[i]>max2 && max2!=max) {
				max2=a[i];
			}
			
		}
		System.out.println(min2);
		System.out.println(max2);
			
		}
	
}
