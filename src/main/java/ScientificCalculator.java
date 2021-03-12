import java.lang.*;
import java.util.*;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Select the required operation");
            System.out.println("1 Square root function");
            System.out.println("2 Factorial function");
            System.out.println("3 Natural log");
            System.out.println("4 Power function");
            System.out.println("5 Exit");

            System.out.print("Enter your option number: ");
            int option = in.nextInt();
            if (option < 1 || option > 5) System.out.println("Option should be between 1 and 5. Try again!");

            else if (option == 1) {
                double num1 = in.nextDouble();
                double res = sqroot(num1);
                System.out.println("Square root of " + num1 + " = " + res);

            }

            else if(option == 5)
                break;
        }
    }

    public static double sqroot(double a) {
        return Math.sqrt(a);
    }
}
