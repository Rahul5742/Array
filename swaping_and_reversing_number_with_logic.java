import java.util.Scanner;

public class swaping_and_reversing_number_with_logic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Swapping and reversing numbers:");

        System.out.print("Enter size: ");
        int size = sc.nextInt(); // Size of the array

        int[] number = new int[size];

        // Fill the array with user input
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            number[i] = sc.nextInt();
        }

        // Swapping elements to reverse the array
        int l = number.length;
        int temp;
        int n = Math.floorDiv(l, 2); //This is not sowing desimal number:

        for (int i = 0; i < n; i++) {
            temp = number[i];
            number[i] = number[l - i - 1];
            number[l - i - 1] = temp;
        }

        // Output the reversed array
        System.out.println("Reversed array:");
        for (int e : number) {
            System.out.print("  " + e);
        }
    }
}
