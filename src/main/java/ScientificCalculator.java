import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.*;
import java.util.*;

public class ScientificCalculator {
    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class);
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
            else if (option == 2) {
                int num1 = in.nextInt();
                int res = factorial(num1);
                System.out.println("Factorial of " + num1 + " = " + res);
            }
            else if (option == 3) {
                double num1 = in.nextDouble();
                double res = natural_log(num1);
                System.out.println("Natural log of " + num1 + " = " + res);
            }
            else if (option == 4) {
                double num1 = in.nextDouble();
                double num2 = in.nextDouble();
                double res = pow(num1, num2);
                System.out.println(num1 + " raised to " + num2 + " = " + res);
            }
            else if(option == 5)
                break;
        }
    }

    public static double sqroot(double a) {
        logger.info("Computing square root of " +a);
        double result = Math.sqrt(a);
        return result;
    }
    public static int factorial(int a) {
        logger.info("Computing factorial of " +a);
        int result = 1;
        for(int i=1; i<=a; i++) {
            result = result * i;
        }
        return result;
    }
    public static double natural_log(double a) {
        logger.info("Computing natural log of " +a);
        double result = Math.log(a);
        return result;
    }
    public static double pow(double a, double b) {
        logger.info("Computing " + a + "raised to the power" +b);
        double result = Math.pow(a, b);
        return result;
    }
}
