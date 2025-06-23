import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)
    {
        int numtoGuess = (int) (Math.random() * 10) + 1; // Random number between 1 and 10
        boolean Done = false; // checks if the input is valid
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
                    Done = true;

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
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine(); // Clear the invalid input
            }
        }
        while (!Done);
    }
}
