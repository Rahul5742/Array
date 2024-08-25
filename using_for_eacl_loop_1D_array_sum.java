import java.util.Scanner;

public class using_for_eacl_loop_1D_array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-D array sum");

        //input
        System.out.print("Enter of array size :");
        int size = sc.nextInt();
        int sum = 0;
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number :");
            number[i] = sc.nextInt();
        }
        //output
        for (int e : number) {
            sum = sum + e;
        }
        System.out.println("This is your sum of array :" + sum);

    }
}
