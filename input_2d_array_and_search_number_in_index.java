import java.util.Scanner;
public class input_2d_array_and_search_number_in_index {
    public static void main(String[] args) {
        System.out.println("2-D array input and search number in index:");
        Scanner sc = new Scanner(System.in);


        //input
        System.out.print("Enter number of rows :");
        int rows = sc.nextInt();
        System.out.print("Enter number of cloum :");
        int cloum = sc.nextInt();
        int[][] number = new int[rows][cloum];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cloum; j++) {
                System.out.print("Enter mark " + i + " " + j + " :");
                number[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter x = ");
        int x = sc.nextInt();
        System.out.println("This is your array :");

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cloum; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }


        // Scearch value of x
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cloum; j++) {
                if (number[i][j] == x) {
                    System.out.println("Found at index: [" + i + "][" + j + "]");
                    break;
                } else {

                    System.out.println("Number not found in the array.");
                    continue;
                }
            }
        }
    }
}
