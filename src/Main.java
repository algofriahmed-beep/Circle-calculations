import java.util.Scanner;

public class Main {

        public static void main(String[] args){

            //Scanner declaration
            Scanner input = new Scanner(System.in);

            //Vars
            double raduis, valuom, area, circumfirence;

            //the input

            System.out.print("Enter the raiduce: ");
            raduis = input.nextDouble();

            //the calcultions

            area = Math.pow(raduis, 2) * Math.PI;
            circumfirence =  2 * Math.PI * raduis;
            valuom = (4.0/3.0) * Math.PI * Math.pow(raduis, 3);

            //the printing

            System.out.printf("The circumfirence is equal: %.2fcm\n", circumfirence);
            System.out.printf("The Area is equal:          %.2fcm²\n", area);
            System.out.printf("The valuom is equal:        %.2fcm³\n", valuom);


            input.close();





        }

}
