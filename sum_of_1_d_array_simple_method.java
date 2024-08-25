import java.util.Scanner;

public class sum_of_1_d_array_simple_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-d array sum  simple method");
        System.out.print("Enter size of array :");
        int size=sc.nextInt();  //input size of array:
        int sum=0;
        int [] number=new int[size]; //1-d array user input:

        for (int e:number) { //1-d array user input loop:

            System.out.print("Enter number  :"); //coment

            e=sc.nextInt(); //1-d array user input number

            sum+=e; //sum of arrray:

        }System.out.println("This is your sum : "+sum); //Result of array:
        System.out.println(); //new line:
    }
}