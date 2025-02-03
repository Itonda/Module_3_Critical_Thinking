// Need this to prompt input. //
import java.util.Scanner;

// Initializes main program. //
public class TaxCalculator {
    public static void main(String[] args) {

        // Initializing variables for calculation. //
        double income;
        double taxHold;

        // Initialize scanner. //
        Scanner inc = new Scanner(System.in);

        // Prompt user input and declare income as user input. //
        System.out.print("Enter income: ");
        income = inc.nextDouble();

        /* If/Else ladder to determine tax withheld and print result.
           10% for less than 500, 15% for 500 - 1500, 20% for 1500 - 2500,
           and 30% for more than 2500. */
        if (income < 500) {
            taxHold = income * 0.1;
            System.out.println("Entered weekly income: " + income);
            System.out.printf("Tax Withheld: %.2f ", taxHold);
        }

        else if (income < 1500) {
            taxHold = income * 0.15;
            System.out.println("Entered weekly income: " + income);
            System.out.printf("Tax Withheld: %.2f ", taxHold);
        }

        else if (income < 2500) {
            taxHold = income * 0.2;
            System.out.println("Entered weekly income: " + income);
            System.out.printf("Tax Withheld: %.2f ", taxHold);
        }

        else {
            taxHold = income * 0.3;
            System.out.println("Entered weekly income: " + income);
            System.out.printf("Tax Withheld: %.2f ", taxHold);
        }
    }
}