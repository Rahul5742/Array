import java.util.Scanner;
public class input_of_1_D_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-D array input :");
        //input of array size :
        System.out.print("Enter size of array :");
        int size=sc.nextInt();
        int a[]=new int[size]; //input templet:

        //input of array number :
        System.out.println("input:");
        for (int i = 0; i<size ; i++) {
            System.out.print("Number ["+i+"] :");
            a[i]=sc.nextInt();
        }
        // output :
        System.out.println("output:");
        for (int i = 0; i <size ; i++) {
            System.out.println("Number ["+i+"] :"+a[i]);
        }
    }
}

