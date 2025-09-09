package day16;

import java.util.Iterator;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = {10, 45, 2, 99, 56, 77};

        // Pehle element ko max maan lo
        int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
				
			}
			
		}
		System.out.println(" yeah sabse bada hai bhai " + max);
		
	}

}
