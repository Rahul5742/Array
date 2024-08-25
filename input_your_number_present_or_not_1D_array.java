import java.util.Scanner;

public class input_your_number_present_or_not_1D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input_your_number_present_or_not_1D_array");

        //input
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + i + ": ");
            number[i] = sc.nextInt();
        }
        
       //output
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (number[i] == x) {
                System.out.println("Present in array at index: " + i);
                found = true;

            }


        }

        if (!found) {
            System.out.println("Not present in array");
        }
    }
}

