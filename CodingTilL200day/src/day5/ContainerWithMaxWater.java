package day5;

import java.util.Arrays;

public class ContainerWithMaxWater {
	public static void main(String[] args) {
		int[]a= {1,8,6,2,5,4,8,3,7};
		int max=maxwater(a);
		System.out.println(max);
		
	}
    public static int maxwater(int[]a){
    	int l=0;
    	int r=a.length-1;
    	int mxw=0;
    	while (l<r) {
    		int w=r-l;
    		int ht=Math.min(a[l],a[r]);
    		int currwater=w*ht;
    		mxw=Math.max(mxw,currwater);
    		if (a[l]<a[r]) {
    			l++;
				
			} else {
				r--;

			}
			
		}
		return mxw;
	
}

}
