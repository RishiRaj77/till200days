package day16;

class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1; // second largest exist nahi karta
        }
        return secondLargest;
    }

    public int getLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // main method Eclipse ke liye
    public static void main(String[] args) {
        int[] arr = {20, 50, 10, 40};

        Solution sol = new Solution();
        int largest = sol.getLargest(arr);
        int secondLargest = sol.getSecondLargest(arr);

        System.out.println("Largest element is: " + largest);
        System.out.println("Second largest element is: " + secondLargest);
    }
}
