import java.util.Scanner;

public class SingleMulti
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int t , b = 1; //define variable

        System.out.println("Which no Table you want to Print ?  : ");
        t =  input.nextInt();

        //created while loop
        while(b <= 10)
        {
            System.out.printf("%d * %d = %d \n", t, b, t * b); //print the the multiplication table
            b++;
        }
    }
}



