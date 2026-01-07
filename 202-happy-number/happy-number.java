class Solution {

    private int next(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = next(n);          // move once
        int fast = next(next(n));    // move twice

        while (slow != fast) {
            if (fast == 1) return true;
            slow = next(slow);
            fast = next(next(fast));
        }

        return slow == 1;
    }
}
