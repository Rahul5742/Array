import java.util.Scanner;
public class find_out_minimum_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("find out minimum number in array");

        //input size of array:
        System.out.print("Enter size in array :");
        int size = sc.nextInt();


        int minimum = Integer.MAX_VALUE;  //declear minimum number:   Integer.MAX_VALUE  =  This is holding maximum number in java:

        int[] number = new int[size];   //1-d array

        for (int i = 0; i < number.length; i++) { //for loop to input 1-d array:
            System.out.printf("Enter number %d :", i + 1);
            number[i] = sc.nextInt();  //input array

            if(number[i]<minimum ){ //condition:
                minimum =number[i];
            }

        }
        System.out.println( "This is your minimum number is :"+minimum ); //print minimum number:



    }

    //same question using for each loop:
//            System.out.println();
//            for (int e : number) {
//                if (e < minimum) { //condition
//                    minimum = e;
//
//                }
//
//
//            }
//            System.out.println("This is your minimum number is:" + minimum); //print minimum number:

}



