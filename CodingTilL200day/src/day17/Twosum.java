package day17;

import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 5, 3};
        int target = 9;

        int[] result = findTwoSum(arr, target);

        if (result != null) {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);
        } else {
            System.out.println("No pair found!");
        }
    }

    // Helper method jo indices return karega
    public static int[] findTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};  // dono index return karega
                }
            }
        }
        return null; // agar pair nahi mila
    }
}
