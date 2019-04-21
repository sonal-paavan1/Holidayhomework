import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String args[])
    {    // define variables
        int a , b, count=0;
        // define scanner name scan
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        a = scan.nextInt();  // Transfer Scanner value into a

        // Create the for loop till b < a

        for(b=2; b<a; b++)
        {
            if(a % b == 0)         // if a%b is Zero then increment count and break the loop
            {
                count++;
                break;
            }
        }
        if(count == 0)      //  compare the value of count and print the given no is prime or not
        {
            System.out.print( "This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}