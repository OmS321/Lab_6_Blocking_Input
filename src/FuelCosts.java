import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double gallons = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        String trash = ""; // Variable to hold any invalid input

        double largeGasPrice;
        double gasMileage;

        boolean done = false; // checks if each input is valid

        do
        {
            System.out.print("\nHow much gallons are in your gas tank? : ");
            if (input.hasNextDouble())
            {
                gallons = input.nextDouble();
                input.nextLine();

                if (gallons < 0)
                {
                    System.out.println("Gallons cannot be negative. Please enter a valid number not " + gallons + ".");
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = input.nextLine();
                System.out.println("Invalid input. Please enter a valid number not " + trash + ".");
            }
        }
        while (!done);

        done = false; // Reset done for the next input

        do
        {
            System.out.print("\nWhat is you fuel efficiency in miles per gallon? : ");

            if (input.hasNextDouble())
            {
                fuelEfficiency = input.nextDouble();
                input.nextLine();

                if (fuelEfficiency < 0)
                {
                    System.out.println("Fuel efficiency cannot be negative. Please enter a valid number not " + fuelEfficiency + ".");
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = input.nextLine();
                System.out.println("Invalid input. Please enter a valid number not " + trash + ".");
            }
        }
        while (!done);

        done = false; // Reset done for the next input

        do
        {
            System.out.print("\nHow much does one gallon of gas cost? : ");

            if (input.hasNextDouble())
            {
                gasPrice = input.nextDouble();
                input.nextLine();

                if (gasPrice < 0)
                {
                    System.out.println("Gas price cannot be negative. Please enter a valid number not " + gasPrice + ".");
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = input.nextLine();
                System.out.println("Invalid input. Please enter a valid number not " + trash + ".");
            }
        }
        while (!done);

        largeGasPrice = (100 / fuelEfficiency) * gasPrice;
        System.out.printf("\nCost to drive 100 miles: $%.2f%n", largeGasPrice);

        gasMileage = gallons * fuelEfficiency;
        System.out.printf("You can drive a total of: %.2f miles", gasMileage);
    }
}
