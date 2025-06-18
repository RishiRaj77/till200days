package day4;

import java.util.Arrays;


public class Squrarr {
	public static void main(String[] args) {
		int []a= {-2,0,3,5,6};
		int []r=newarr(a);
		System.out.println(Arrays.toString(r));
		
	}
	public static int[]newarr (int[] a){
		int[] ans= new int [a.length];

		int left=0;
		int right=a.length-1;
		int k=ans.length-1;
		
		while (left<right) {
			if (a[left]*a[left] <= a[right] * a[right]) {
				ans[k]=(a[right] * a[right]);
				k--;
				right--;
				
			}
			else {
				ans[k]=(a[left]*a[left]);
				left++;
				k--;
			}
			
			
		}
		return ans;
	}
   
}

