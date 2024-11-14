import java.util.*;
public class kadanes_sum {
    static int largest(int arr[] , int n){ //Time complexity is : O(N) this is the best algo for the time complexity of O(1)
        int sc = 0;
        int largest = 0;

        for(int i=0 ; i<n ; i++){
            sc = sc + arr[i];
            if(sc<0){
                sc = 0;
            }
            largest = Math.max(sc, largest);
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int n  = sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of subarray is:"+largest(arr,n));

    }

}
