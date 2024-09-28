import java.util.*;

public class inserting_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, i, pos, elmt;

        System.out.println("Enter the size of the array:");
        size = sc.nextInt();

        int a[] = new int[size + 1]; // Allocate one extra space for insertion

        System.out.println("Enter the elements:");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be inserted:");
        elmt = sc.nextInt();

        System.out.println("Enter the position where the element should be inserted (1-based index):");
        pos = sc.nextInt();

        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position.");
            return;
        }

        // Shifting elements to the right
        for (i = size; i >= pos; i--) {
            a[i] = a[i - 1];
        }

        // Insert the new element
        a[pos - 1] = elmt;

        System.out.println("Array after insertion:");
        for (i = 0; i <= size; i++) {
            System.out.print(a[i] + " ");

            //Time complexity of inserting an Element in an Array: O(n^2)
        }
    }
}
