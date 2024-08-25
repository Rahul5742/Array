import java.util.Scanner;
public class input_1D_array_calculate_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input_1-D_array_calculate_average :");
        //input
        System.out.print("Enter size of array :");
        int size=sc.nextInt();
        int [] mark=new int[size];
        int sum=0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter mark "+i+" :");
            mark[i]=sc.nextInt();

        }
        //output
        for(int e:mark){
            sum +=e;



        }
        System.out.println(sum/size);


    }

}
