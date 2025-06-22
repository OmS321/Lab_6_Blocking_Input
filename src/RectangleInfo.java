import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        double rWidth = 0;
        double rLength = 0;

        double rArea;
        double rPerimeter;
        double rDiagonal;

        boolean Done = false; // checks if each input is valid

        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Enter the width of the rectangle: ");

            if (input.hasNextDouble())
            {
                rWidth = input.nextDouble();

                if (rWidth < 0)
                {
                    System.out.println("Width cannot be negative. Please enter a valid number.");
                }
                else
                {
                    Done = true;
                }
            }

            else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
            }
        }
        while (!Done);


        Done = false; // Reset Done for the next input


        do
        {
            System.out.println("Enter the length of the rectangle: ");

            if (input.hasNextDouble())
            {
                rLength = input.nextDouble();

                if (rLength < 0)
                {
                    System.out.println("Length cannot be negative. Please enter a valid number.");
                }
                else
                {
                    Done = true;
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
            }
        }
        while (!Done);

        rArea = rWidth * rLength;
        rPerimeter = 2 * (rWidth + rLength);
        rDiagonal = Math.sqrt((rWidth * rWidth) + (rLength * rLength));

        System.out.println();
        System.out.printf("The perimeter of the rectangle is: %.2f\n", rPerimeter);
        System.out.printf("The area of the rectangle is: %.2f\n", rArea);
        System.out.printf("The diagonal of the rectangle is: %.2f\n", rDiagonal);
    }
}
