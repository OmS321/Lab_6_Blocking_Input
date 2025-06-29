import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int numtoGuess = generator.nextInt(10) + 1; // Random number between 1 and 10

        boolean done = false; // checks if the input is valid
        String trash = ""; // Variable to hold any invalid input

        int userGuess = 0;

        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Pick a number between 1 and 10: ");

            if (input.hasNextInt())
            {
                userGuess = input.nextInt();

                if (userGuess < 1 || userGuess > 10)
                {
                    System.out.println("Your guess is out of range.");
                }
                else
                {
                    done = true;

                    if (userGuess < numtoGuess)
                    {
                        System.out.println("My number was: " + numtoGuess);
                        System.out.println("Your guess was too low.");
                    }
                    else if (userGuess > numtoGuess)
                    {
                        System.out.println("My number was: " + numtoGuess);
                        System.out.println("Your guess was too high.");
                    }
                    else
                    {
                        System.out.println("My number was: " + numtoGuess);
                        System.out.println("Your guess was right on the money!");
                    }
                }
            }
            else
            {
                trash = input.nextLine();
                System.out.println("Invalid input. Please enter a valid number not " + trash + ".");
                // Clear the invalid input
            }
        }
        while (!done);
    }
}
