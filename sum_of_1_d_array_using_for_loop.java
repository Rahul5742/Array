import java.util.Scanner;

public class sum_of_1_d_array_using_for_loop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-d array sum :");
        System.out.print("Enter size of array :");
        int size=sc.nextInt();  //input size of array:
        int sum=0;
        int [] number=new int[size]; //1-d array user input:

        for (int i = 0; i <number.length ; i++) { //1-d array user input loop:

            System.out.printf("Enter number %d :",i+1); //i=0 than i+1=1:

            number[i]=sc.nextInt(); //1-d array user input number

            sum+=number[i]; //sum of arrray:

        }System.out.println("This is your sum : "+sum); //Result of array:
        System.out.println(); //new line:
    }
}
