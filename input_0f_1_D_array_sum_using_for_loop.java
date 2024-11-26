import java.util.Scanner;
public class input_0f_1_D_array_sum_using_for_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input of array size:
        System.out.print("Enter size :");
        int size=sc.nextInt();
        int mark[]=new int[size];
        //input of a array number:
        int sum=0;
        System.out.println("input");
        for (int i = 0; i <size ; i++) {
            System.out.print("Enter number :");
            mark[i]=sc.nextInt();
        }
        //output sum of array: using for loop:
        System.out.println("output:");
        for (int i = 0; i <size ; i++) {
            sum+=mark[i];
            System.out.println("this is your mark : "+sum);
        }
        System.out.println("This is your array sum:"+sum);
    }
}