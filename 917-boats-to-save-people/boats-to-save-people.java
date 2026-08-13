class Solution {
    public int numRescueBoats(int[] arr, int target) {
        Arrays.sort(arr);

        int n = arr.length;
        int l = 0;
        int  r = n-1;
        int count = 0;

        while( l<= r){
            int sum = arr[l]+arr[r];
            if(sum <= target){
                l++;
            }
            r--;
            count++;

            }
 return count;
        }
       
        
    }
