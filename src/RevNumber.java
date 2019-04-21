import java.util.Scanner;

public class RevNumber
{
    public static void main(String []args)
    {
        int rem, num, rev=0;          // define variables
        Scanner input = new Scanner(System.in);   // define new Scanner

        System.out.print("Enter a number : ");
        num = input.nextInt();

        while(num != 0)                 //  Run the while loop till num > 0
        {
            rem = num % 10;
            rev =  (rev*10) + rem;
            num = num/10;
        }

        System.out.println("Reverse Number is " +rev);
    }
}


