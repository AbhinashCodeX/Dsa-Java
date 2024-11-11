import java.util.*;
public class printing_pairs {
    static void printing_pairs(int[] arr , int n){
        for (int i=0 ; i<n ; i++){
            int x = arr[i];

            for (int j=0; j<n ; j++){
                int y =arr[j];

                System.out.println("("+ x + ","+ y +")");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Number to be Paired:");
        for (int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        printing_pairs(arr,n);
    }
}
