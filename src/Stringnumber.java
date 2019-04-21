import java.util.Scanner;

public class Stringnumber
{
    public static void main (String []args){

        {   //define variable
            String orig;
            int i, length, count=0;
            Scanner scan = new Scanner(System.in); //define scanner

            //Enter any name with A name
            System.out.print("Enter any String name with A : ");
            orig = scan.nextLine();

            length = orig.length();      // Find the length of the String using length() function
            System.out.println("Length = " +length);

            for(i=length-1; i>=0; i--)     //   run the for loop until i>= 0
            {
                if (orig.charAt(i) == 'a' || orig.charAt(i) == 'A')   //  if given character position is " a or A " then increment count
                    count++;
            }

            System.out.print(count+ " a in the String " );
        }
    }
    }



