import java.util.*;
public class traversing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size,i;
        System.out.println("Enter the Size of the Array");
        size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the Element");
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements Are:");
        for(i=0;i<size;i++){
            System.out.println(a[i]);
        }
    }
}
