import java.util.*;
public class Del_Array {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size,i,pos;

        System.out.println("Enter the size of the Array:");
        size=sc.nextInt();

        System.out.println("Enter the Elements:");
        int a[]=new int[size];
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Positon to be Deleated");
        pos=sc.nextInt() ;
        if(pos<1 || pos>size){
            System.out.println("Invalid Position");
            return;
        }

        for(i=pos-1;i<size-1;i++){
            a[i]=a[i+1];
        }
        size--;

        System.out.println("Array After Deletion:");
        for(i=0;i<size;i++){
            System.out.println(a[i]+" ");
        }

    }
}
//Time complexity of Deleting an Element from the Array is = O(n)
