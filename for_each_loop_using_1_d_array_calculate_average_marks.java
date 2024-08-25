import java.util.Scanner;

public class for_each_loop_using_1_d_array_calculate_average_marks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("All Student physics average marks calculate using for each loop"); //titel:
        System.out.print("Enter Total student number :"); //coment size of input :
        int size=sc.nextInt();//input of size in array:

        float sum=0.0f; //assuming sum

        float [] mark=new float[size]; //1-d array:

        for(float e:mark){ //using for each loop:

            System.out.print("Enter physics mark :"); //comment marks of input:
            e=sc.nextFloat(); //marks input:
            sum+=e; //sum of average:
        }
        System.out.println("This is  total of all student physics mark :"+sum); //total marks:
        System.out.println("All student physics average marks :"+(sum/size)); //average marks:

    }
}