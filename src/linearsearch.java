import java.util.*;

public class linearsearch {
//    static int linear_search(int[] arr, int n, int key) {
//        for (int i = 0; i < n; i++) {
//            // Check if the current element matches with the key
//            if (arr[i] == key) {
//                return i; // return the index of the found key
//            }
//        }
//        // If the loop completes, key was not found
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {10, 15, 12, 9, 6, 4, 3, 10, 8};
//        int n = arr.length;
//
//        System.out.print("Enter the key to search: ");
//        int key = sc.nextInt();
//
//        int index = linear_search(arr, n, key);
//        if (index != -1) {
//            System.out.println(key + " is present at index " + index);
//        } else {
//            System.out.println(key + " is NOT Found!");
//        }
//
////        sc.close();
//    }

    static int linear_search(int[] arr , int n , int key){
        for(int i=0 ; i<n ; i++) {
            if (arr[i] == key) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= { 5,8,7,6,9,4,3,1,12};
        int n = arr.length;

        System.out.println("Enter the Key value:");
        int key = sc.nextInt();

        int index = linear_search(arr,n,key);
            if(index!=0){
                System.out.println(key +"present at Index"+ index);
            }else {
                System.out.println(key + "Not Found!!");
            }
    }
}

