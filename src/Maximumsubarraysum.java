import java.util.Scanner;

public class Maximumsubarraysum {

    static int maximum_subarray(int[] arr) {
        // Check if all elements are negative
        boolean allNegative = true;
        int largest = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > 0) {
                allNegative = false;
            }
            largest = Math.max(largest, x);
        }

        // Special case for all negative elements
        if (allNegative) {
            return largest;
        }

        // Kadane's Algorithm for maximum subarray sum
        int currentSum = 0;
        int maxSum = 0;
        for (int x : arr) {
            currentSum += x;
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The maximum subarray sum is: " + maximum_subarray(arr));
    }
}
