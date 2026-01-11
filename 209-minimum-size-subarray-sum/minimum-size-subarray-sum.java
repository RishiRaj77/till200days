class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int i = 0, j=0, sum = 0;
        int size = Integer.MAX_VALUE;

      while(j<nums.length){
            sum = sum + nums[j]; // expand window

            // shrink while condition is satisfied
            while (sum >= target) {
                size = Math.min(size, j - i + 1);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }

        return size == Integer.MAX_VALUE ? 0 : size;
    }
}
