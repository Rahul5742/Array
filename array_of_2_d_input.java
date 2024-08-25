import java.util.Scanner;

public class array_of_2_d_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2-D array input");
        System.out.print("Enter rows :");
        //input rows and cloum
        int rows = sc.nextInt();
        System.out.print("Enter cloum :");
        int cloum = sc.nextInt();
        int mark[][] = new int[rows][cloum];
        //input value
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cloum; j++) {

                System.out.print("Enter your mark "+i+" , "+j+" :");
                mark[i][j] = sc.nextInt();


            }



        }//output
        System.out.println("normal type of printing :");
        System.out.print(mark[0][0]+"  ");
        System.out.print(mark[0][1]+"  ");
        System.out.print(mark[0][2]+"  ");
        System.out.println();
        System.out.print(mark[1][0]+"  ");
        System.out.print(mark[1][1]+"  ");
        System.out.print(mark[1][2]+"  ");
        System.out.println();
        System.out.print(mark[2][0]+"  ");
        System.out.print(mark[2][1]+"  ");
        System.out.print(mark[2][2]+"  ");
        System.out.println();
        System.out.print(mark[3][0]+"  ");
        System.out.print(mark[3][1]+"  ");
        System.out.print(mark[3][2]+"  ");
        System.out.println();
        System.out.println("for loop type printing");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cloum ; j++) {
                System.out.print(mark[i][j]+"  ");
            }
            System.out.println();

        }


    }
}









