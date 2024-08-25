import java.util.Scanner;
public class adding_2_d_array_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Addin 2 matrix");


        System.out.print("Enter cloum:");
        int clo=sc.nextInt(); //input cloum:
        System.out.print("Enter rows :");
        int row=sc.nextInt(); //input rows:

        //this is 2-d array of matrix addition:
        int [][]sum=new int[row][clo]; //sum array:
        int [][]matrix1=new int[row][clo]; //matrix1 array:
        int [][]matrix2=new int[row][clo]; //matrix2 array:

        //input:
        //2-d array matrix1 input:
        System.out.println("Enter the element of  matrix1 :");
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <clo ; j++) {
                System.out.printf("Enter element at position (%d,%d): ", i + 1, j + 1);
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println();


        //2-d array matrix1 input:
        System.out.println("Enter the element of  matrix2 :");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <clo ; j++) {
                System.out.printf("Enter element at position (%d,%d): ", i + 1, j + 1);
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        //2-d array sum:
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < clo; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println();
        }
        System.out.println();

        //output
        //2-d array matrix1 output:
        System.out.println("matrix1 :");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <clo ; j++) {

                System.out.print("  "+matrix1[i][j]);

            }
            System.out.println();


        }

        //2-d array matrix1 output:
        System.out.println("matrix2 :");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <clo ; j++) {

                System.out.print("  "+matrix2[i][j]);

            }
            System.out.println();
        }


        // //2-d array adding (matrix1 + matrix2) output:
        System.out.println("The sum of 2 matrix :");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <clo ; j++) {


                System.out.print("  "+sum[i][j]);


            }
            System.out.println();


        }

    }

}

