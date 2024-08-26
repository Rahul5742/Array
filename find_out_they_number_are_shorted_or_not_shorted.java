import java.util.Scanner;
public class find_out_they_number_are_shorted_or_not_shorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("sorted or not is aray ");
        System.out.print("Enter array of size :");
        int size=sc.nextInt(); //input size of array:

        boolean a=true; //declear boolean valur:

        int [] number=new int[size]; //array templet:

        for (int i = 0; i <size ; i++) { //input of array number:
            System.out.printf("Enter you number %d :",i+1);
            number[i]=sc.nextInt();
        } //end loop:

        for (int i = 0; i <size-1 ; i++) { //condition loop:
            if(number[i]>number[i+1]){ //condition:
                a=false;
                break;
            } //end loop:
            //output
        }if(a){ //condition are false this line execute:
            System.out.println("shorted:");
        }else{ //condition are true this line execute:
            System.out.println("not shorted:");
        }

    }
}