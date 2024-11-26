import java.util.Scanner;
public class input_of_1_D_array_using_foreach_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input of array size:
        System.out.print("Enter size :");
        int size=sc.nextInt();
        int mark[]=new int[size];
        //input of a array number:
        System.out.println("input");
        for (int i = 0; i <size ; i++) {
            System.out.print("Enter number :");
            mark[i]=sc.nextInt();
        }
        //output of a array number: using foreach loop:
        System.out.println("output:");
        for(int ma:mark){
            System.out.println("this is your mark : "+ma);
        }

    }
}