import java.util.*;
//Time complexity : O(N ^ 3)
public class largestsumsubarray {  //This is the Brute Force Technique
    static int largest_subarray(int[] arr , int n){
        int largest_sum = 0;
        for(int i=0; i<n ; i++){
            for(int j=1 ; j<n ; j++){
            int subarraySum=0;

            for(int k=i ; k<=j ; k++){
                subarraySum += arr[k];
            }
                largest_sum = Math.max(largest_sum,subarraySum);
            //Used to choose between subarraysun and largest which is max amont the subarays and largest.
        }

    }
        return largest_sum;

}

//Prefix sum Approach Time COmplexity is O(N^2).
    //This is the prefix sum Technique.
    static int largestSubarraySum2(int[] arr, int n){

        //Prefix Sums
        int[] prefix = new int[100];
        prefix[0] = arr[0];

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        //largest sum login
        int largest_sum = 0;

        for(int i=0;i<n;i++){
            for(int j=i; j<n; j++){
                int subarraySum = i>0 ? prefix[j] - prefix[i-1] : prefix[j];
                //put a check is subarraySum > largest_sum
                largest_sum = Math.max(largest_sum,subarraySum);

            }
        }
        return largest_sum;
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Arrays:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the number to be inserted in the array:");
        for(int i=0; i<n ; i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("The Sum of the Subarrays is:"+largest_subarray(arr,n));
        System.out.println("The Sum of the Subarrays is:"+largestSubarraySum2(arr,n));
    }
}
