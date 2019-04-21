import java.util.Scanner;

public class TableForloop {

    public static void main(String[] args)
    {
        //declare variable cal and num and initialize count to 1
        int num, i, cal;

        //input scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for a multiplication table  : ");
        //scanner store as num
        num = input.nextInt();

        //setting up loop for multiplication of num by numbers for 1 to 10
        for ( i = 1; i <= 10; i++)
        {
            // setting uo internal loop to only do the multiplication from 1 to enter num
            for (int j = 1; j <= num; j++)
            {
                //multiplication
                cal = j * i;

                //use \t\t for spacing to print results
                System.out.print("\t\t"+j+"*"+i+"="+cal);
            }
            //move to the next line once all numbers from 1 to num multiplied by i
                System.out.println();
        }
    }

}





