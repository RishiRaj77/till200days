package day3;

import java.util.Arrays;

public class Merge2sortedarray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3}; // First sorted array
        int[] b = {4, 5, 6, 7}; // Second sorted array
        int m = a.length; // Length of first array
        int n = b.length; // Length of second array
        
        // Create a new array to hold the merged result
        int[] mergedArray = new int[m + n];
        
        // Call the merge method
        merge(a, b, mergedArray, m, n);
        
        // Print the merged array
        System.out.println(Arrays.toString(mergedArray));
    }

    public static void merge(int[] a, int[] b, int[] mergedArray, int m, int n) {
        int i = m - 1; // Pointer for the last element of a
        int j = n - 1; // Pointer for the last element of b
        int k = m + n - 1; // Pointer for the last position of mergedArray
        
        // Merge the arrays from the end
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                mergedArray[k--] = a[i--];
            } else {
                mergedArray[k--] = b[j--];
            }
        }
        
        // If there are remaining elements in b, add them
        while (j >= 0) {
            mergedArray[k--] = b[j--];
        }
        
        // If there are remaining elements in a, they are already in place
        while (i >= 0) {
            mergedArray[k--] = a[i--];
        }
    }
}
