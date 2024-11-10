import java.util.*;
public class reverse_array {
    static int reversearray(int[] arr , int n ){
        int s=0;
        int e= n-1;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] =temp;
            s += 1;
            e -=1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int n = arr.length;

        System.out.println("Enter the Number of Elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements of the Array:");
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        reversearray(arr,n);

        //this is to display the array
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
