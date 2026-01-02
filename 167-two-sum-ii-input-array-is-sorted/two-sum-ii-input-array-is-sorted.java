class Solution {
    public int[] twoSum(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;

        while(i<j){
            if(a[i]+a[j]<target){
                i++;
            }
            else if(a[i]+a[j] > target){
                j--;
            }
            else{
                return new int []{ i+1 ,j+1};
            }
        }
        return null;
    }
}