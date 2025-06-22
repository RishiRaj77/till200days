package day8;

import java.util.Arrays;

public class ConcatenationofArrays {
	 
    public int[] getConcatenation(int[] nums) {
    	int n = nums.length;
    	int[] ans = new int[2*n];
    	for (int i = 0; i < nums.length; i++) {
    		ans[i]=ans[i+n]=nums[i];
			
		}
       return ans;
        }
       
    
    public static void main(String[] args) {
    	ConcatenationofArrays solution = new ConcatenationofArrays();
        
        // Test case
        int[] nums = {1, 2, 3};
        int[] result = solution.getConcatenation(nums);
        
        // Print the result
        System.out.print("Result: ");
       System.out.println(Arrays.toString(result));
    }
	
	

	

}
