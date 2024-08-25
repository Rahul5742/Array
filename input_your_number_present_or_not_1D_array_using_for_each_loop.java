import java.util.Scanner;

public class input_your_number_present_or_not_1D_array_using_for_each_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input_your_number_present_or_not_1D_array_using_for_each_loop");

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + i + ": ");
            number[i] = sc.nextInt();
        }

        boolean found = false;
        for(int e:number) {
            if (e == x) {
                System.out.println("Present in array at index: " );

                found = true;
                break;
            }


        }

        if (!found) {
            System.out.println("Not present in array");
        }
    }
}

