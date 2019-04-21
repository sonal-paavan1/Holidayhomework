import java.util.Scanner;

public class Poneze
{
    public static void main(String []args)
    {
        //define variable
        int countp=0, countn=0, countz=0, i;
        int arr[] = new int[10];
        //define the scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any 10 Numbers : ");

        for(i=0; i<10; i++)       // User should enter any 10 numbers
        {
            arr[i] = input.nextInt();
        }
        for(i=0; i<10; i++)     //  Run the for loop till 10
        {
            if(arr[i] < 0)
            {
                countn++;             // if no is <0 then increment countn
            }
            else if(arr[i] == 0)
            {
                countz++;               // if no == 0 then increment countZ
            }
            else
            {
                countp++;               // else increment countP
            }
        }


        // print positive, negative and zero nos

        System.out.print(countp + " Positive Numbers");
        System.out.print("\n" + countn + " Negative Numbers");
        System.out.print("\n" + countz + " Zero");
    }
    }





