import java.util.Scanner;
public class swaping_and_reverse_array_without_logic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("swaping and reverse number normal way to print:");

        System.out.print("Enter size:");
        int size = sc.nextInt(); //size in array:

        int [] number=new int [size]; //1-d array:
        for (int i = 0; i <size ; i++) {
            System.out.printf("Enter number %d :",i+1);
            number[i]=sc.nextInt();  //input number:
        }

        //output swaping number:
        System.out.println("This is reverse order:");
        for (int i = size-1; i >=0 ; i--) {
            System.out.print(number[i]+",");

        }
        System.out.println();
    }
}
