import java.util.Scanner;

public class Sumdigit
{
    public static void main(String []args)
    {
        int number, reminder, sum = 0;    // define variables

        Scanner input = new Scanner(System.in);    // define new scanner variable
        System.out.print("Enter any five  digit number:");

        number = input.nextInt();     //   transfer input value into number

        for (sum = 0; number > 0; number = number/10)        // Run the for loop till number > 0
        {
            reminder = number % 10;           //  get the last digit of the number
            sum = sum + reminder;              //  Add the digit to Sum
        }

        System.out.println("Sum of the digits of Given Number = " +sum);

    }
}







