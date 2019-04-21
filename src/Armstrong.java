import java.util.Scanner;

public class Armstrong
{
    //create method
    public static void main(String []args) {
        int num, rem, sum = 0, temp;  //define variable
        Scanner input = new Scanner(System.in); // define scanner variable

        System.out.print("Enter any number: ");
        num = input.nextInt();
        //
        temp = num;  //Transfer number value in to temp

        while (temp != 0)    //Run the while loop value until the temp is >0
        {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        if (sum == num)  //compare the sun value with num
        {
            System.out.println(num + " Is an Armstrong number ");

        } else
            {
            System.out.println(num + " Is not Armstrong number");

        }
    }
}









