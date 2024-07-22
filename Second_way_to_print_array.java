public class Second_way_to_print_array {
    public static void main(String[] args) {

        int [] marks=new int[5];
        marks[0]=100;
        marks[1]=70;
        marks[2]=70;
        marks[3]=69;
        marks[4]=98;

        System.out.println("this is time takrn method = "+marks[0]);

        for (int i=0;i<5;i++){

            System.out.println("This is easy method = "+marks[i]);
        }
    }
}

