import java.util.Scanner;

public class Main {

        public static void main(String[] args){

            //Scanner declaration
            Scanner input = new Scanner(System.in);

            //Circle
            circal c1 = new circal();
            //Vars
            double radius;

            //the input

            System.out.print("Enter the raiduce: ");
            radius = input.nextDouble();


            //set using
            c1.setRadius(radius);

            //the methods and its printing
            System.out.printf("the area: %.2fcm\n", c1.circalArea());
            System.out.printf("the circumfirence: %.2fcm²\n", c1.circalCircumfirence());
            System.out.printf("the Volum: %.2fcm³\n", c1.circalVolum());


            input.close();





        }

}
