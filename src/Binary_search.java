import java.util.*;
public class Binary_search {
    //    static int binarysearch(int[] arr,int n , int key){
//        int s = 0;
//        int e = n-1;
//
//        while(s<=e){
//            int mid = (s+e)/2;
//            if(arr[mid] == key){
//                return mid;
//            }else if(arr[mid]> key){
//                e = mid -1;
//            }else{
//                s = mid +1;
//            }
//        }
//        return -1;
//
//    }
    static int binarysearch(int[] arr, int n, int key) {
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Key Value:");
        int key =sc.nextInt();

        int index = binarysearch(arr , n , key);
        if(index!=-1){
            System.out.println(key + "Found at index:" + index);
        }else{
            System.out.println(key + "Not Found!!");
        }
    }
}

