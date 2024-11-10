import java.util.*;
public class array_inputmarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[100];
        System.out.println("Enter the no of students:");
        int n =sc.nextInt();

        //Input of the marks
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            marks[i]= marks[i] * 2;  //This is Used to multiply the arrays
        }

        //Output of the marks
        System.out.println("Marks of the students are:");
        for(int i=0;i<n;i++){
            System.out.println("students"+(i + 1)+ ":"+ marks[i]);
            //(i + 1)Used to iterate the number of students number wise

        }

    }
}
