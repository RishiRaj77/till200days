package Day2;

import java.util.Arrays;

public class TWOsum {
	public static void main(String[] args) {
		int a[]= {2,7,11,15};
		int arr = a.length-1;
		int target = 9;
		int result[]=(Twosum(arr, a, target));
		
		 System.out.println(Arrays.toString(result));
	}


public static int[] Twosum(int arr,int []a,int target ){
	int left=0;
	int right=arr;
	
	while (left<right) {
		int sum= a[left]+a[right];
		 if (sum == target) {
            // return new int[]{left, right}; //return index value
             return new int[]{left+1, right+1}; //return position
		 } else if (sum < target) {
             left++;
         } else {
             right--;
         }
		
		
		
		
	}
	 return new int[]{};
}
}