import java.util.Scanner;

public class sum_of_1D_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-D array sum");

        //input
        System.out.print("Enter of array size :");
        int size=sc.nextInt();
        int sum=0;
        int [] number=new int[size];

        //output
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number "+i+" :");
            number [i]=sc.nextInt();
            sum+=number[i];
        }
        System.out.println("This is your sum of array :"+sum);

    }
}