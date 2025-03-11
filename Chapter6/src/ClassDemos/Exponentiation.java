package ClassDemos;

import java.util.Scanner;

public class Exponentiation {

	// Method to compute exponentiation
    public static double computeExponentiation(double base, double exponent) 
    {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get user input for base and exponent
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Compute the result using the computeExponentiation method
        double result = computeExponentiation(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

}
