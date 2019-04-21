
public class FibonacciSeries
{
    public static void main(String[] args)
    {
        //define variable
        int a = 15;
        int b = 0;
        int c = 1;


        System.out.print("Fibonacci Series of "+a+" numbers: ");

        for (int i = 1; i <= a; ++i)      // create the for loop till i <=15
        {
            System.out.print( b+" ");
            //On each iteration, we are assigning second number
            //to the first number and assigning the sum of last two
            //numbers to the second number

            int sum = b + c;
            b = c;
            c = sum;
        }

    }
}


