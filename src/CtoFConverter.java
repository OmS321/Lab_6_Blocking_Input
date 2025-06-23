import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double celsius;
        boolean done = false;

        String trash = "";

        do
        {
            System.out.println("Enter temperature in Celsius: ");

            if (input.hasNextDouble())
            {
                celsius = input.nextDouble();

                done = true;

                double Fahrenheit = (celsius * 9 /5) + 32;

                System.out.print("Temperature in fahrenheit: " + Fahrenheit);
            }
            else
            {
                trash = input.nextLine();
                System.out.println("Invalid input. Please enter a valid number not " + trash + ".");
            }
        }
        while (!done);

    }
}