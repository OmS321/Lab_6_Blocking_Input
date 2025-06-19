import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double Celsius;
        boolean Done = false;

        do
        {
            System.out.println("Enter temperature in Celsius: ");

            if (input.hasNextDouble())
            {
                Celsius = input.nextDouble();

                Done = true;

                double Fahrenheit = (Celsius * 9 /5) + 32;

                System.out.println("Temperature in fahrenheit: " + Fahrenheit);
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
            }
        }
        while (!Done);

    }
}