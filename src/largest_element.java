import java.util.*;

public class largest_element {
    static int largestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) { // start from 1 since max is initialized to arr[0]
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max; // return the maximum value
    }

//    static int largestElement(int[] arr){
//        int max = arr[0];
//        for(int i=1 ; i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The largest element of the array: " + largestElement(arr));
        sc.close();
    }
}
