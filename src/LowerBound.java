import java.util.Scanner;

public class LowerBound {
    public static int findLowerBound(int[] A, int Val) {
        if (Val < A[0]) return -1; // If Val is less than the smallest element

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] <= Val) return A[i];
        }

        return -1; // In case of an empty array (edge case)
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

        System.out.println("Enter the value to find the lower bound:");
        int Val = sc.nextInt();

        int lowerBound = findLowerBound(arr, Val);

        if (lowerBound == -1) {
            System.out.println("No lower bound found (value is smaller than the smallest element).");
        } else {
            System.out.println("The lower bound of " + Val + " is " + lowerBound);
        }

        sc.close();
        /*
    Example 1
    Suppose A = {1, 3, 5, 7, 9} and Val = 6.

    Initial Check: Val (6) is not smaller than A[0] (1), so we proceed to the loop.
    Loop Execution:
    i = 4: A[4] = 9 → 9 is greater than 6, so continue.
    i = 3: A[3] = 7 → 7 is greater than 6, so continue.
    i = 2: A[2] = 5 → 5 is less than 6, so we return 5.
    */
    }
}

