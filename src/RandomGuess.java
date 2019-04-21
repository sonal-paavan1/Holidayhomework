import java.util.Random;
import java.util.Scanner;

public class RandomGuess
{

        public static void main(String[] args)
        {

            Random rand = new Random();         //  define any random number between (1 -100) using rand() function
            int value = rand.nextInt(100), num;

            Scanner input = new Scanner(System.in);

            System.out.println("Guess the Random NO between 1 - 100");

            do {                     // Run the do while loop until user guess the correct no

                System.out.print("Guess the Random Number  : ");
                num = input.nextInt();

                if (num > value)       // if user enter no > Random no then print "its Too high"
                    System.out.println("Too high Try Again  ");
                if (num < value)        // if user enter no < Random no then print "its Too low"
                    System.out.println("Too low Try again  ");


            } while (num != value);

            System.out.println(" Your Guessing is Correct ");
        }

}
