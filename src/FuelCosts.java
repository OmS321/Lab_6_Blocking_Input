import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double Gallons = 0;
        double FuelEfficiency = 0;
        double GasPrice = 0 ;

        double LargeGasPrice;
        double GasMileage;

        boolean Done = false; // checks if each input is valid

        do
        {
            System.out.println("How much gallons are in your gas tank? : ");
            if (input.hasNextDouble())
            {
                Gallons = input.nextDouble();

                if (Gallons < 0)
                {
                    System.out.println("Gallons cannot be negative. Please enter a valid number.");
                }
                else
                {
                    Done = true;
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine();
            }
        }
        while (!Done);

        Done = false; // Reset Done for the next input

        do
        {
            System.out.println("What is you fuel efficiency in miles per gallon? : ");

            if (input.hasNextDouble())
            {
                FuelEfficiency = input.nextDouble();

                if (FuelEfficiency < 0)
                {
                    System.out.println("Fuel efficiency cannot be negative. Please enter a valid number.");
                }
                else
                {
                    Done = true;
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine();
            }
        }
        while (!Done);

        Done = false; // Reset Done for the next input

        do
        {
            System.out.println("How much does one gallon of gas cost? : ");

            if (input.hasNextDouble())
            {
                GasPrice = input.nextDouble();

                if (GasPrice < 0)
                {
                    System.out.println("Gas price cannot be negative. Please enter a valid number.");
                }
                else
                {
                    Done = true;
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine();
            }
        }
        while (!Done);

        LargeGasPrice = (100 / FuelEfficiency) * GasPrice;
        System.out.printf("Cost to drive 100 miles: $%.2f%n", LargeGasPrice);

        GasMileage = Gallons * FuelEfficiency;
        System.out.printf("You can drive a total of: %.2f miles", GasMileage);
    }
}
