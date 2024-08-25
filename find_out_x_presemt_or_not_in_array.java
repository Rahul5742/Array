import java.util.Scanner;

public class find_out_x_presemt_or_not_in_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("find out x present in  arrary :");
        //input:
        System.out.print("Enter size of array :");
        int size = sc.nextInt();  //input size of array:

        System.out.print("Enter value of x : ");
        int x = sc.nextInt();
        int[] number = new int[size]; //1-d array user input:

        for (int i = 0; i < number.length; i++) { //1-d array user input loop:


            System.out.printf("Enter number %d :", i + 1); //i=0 than i+1=1:
            number[i] = sc.nextInt(); //input array:
        }
        //output:
        for (int i = 0; i < number.length; i++) {
            if (x == number[i]) { //condition x is present

                System.out.printf("%d present :\n", i+1); //present


            } else { //condition x is not present
                System.out.println((i+1)+" not.    :"); //not present


            }
        }
    }
}

