import java.util.Scanner;
public class fint_out_maximum_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("find out maximum number in array");

        //input size of array:
        System.out.print("Enter size in array :");
        int size = sc.nextInt();


        int maximum = 0;  //declear maximum number:

        int[] number = new int[size];
        for (int i = 0; i <number.length; i++) {
            System.out.printf("Enter number %d :", i+1);
            number[i] = sc.nextInt();

            if(number[i]>maximum ){ //condition:
                maximum =number[i];
            }

        }
        System.out.println( "This is your maximum number is :"+maximum ); //print maximum number:




        //same question using for each loop:

//        System.out.println();
//       for(int e:number){
//           if(e>maximum ){ //condition
//               maximum =e;
//
//           }
//
//
//            } System.out.println("This is your maximum number is:"+maximum ); //print maximum number:

    }

}
