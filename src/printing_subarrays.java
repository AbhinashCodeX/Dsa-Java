import java.util.*;
public class printing_subarrays {
    static void printingsubarrays(int[] arr, int n){

        //Three loop for the pyramid printing of the numbers
        for(int i=0;i<n;i++){
            for(int j=i; j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + ",");
                }
                System.out.println();
            }

        }

    }

// Print the sum of each subarray & find out the largest sum


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Array Containing

//        int arr[] = {-2,3,4,5,-12,6,2,3};
//        int n = arr.length;

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter the Number of Arrays:");
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        printingsubarrays(arr,n);

    }

}