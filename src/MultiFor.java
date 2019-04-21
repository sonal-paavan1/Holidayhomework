import java.util.Scanner;

public class MultiFor {
    public static void main(String[] args) {

        int t;  //define variable
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the No for Multiplication Table : ");
        t = input.nextInt();


        for (int i = 1; i <= 10; ++i)  // create for loop till i <=10
        {
            System.out.printf("%d * %d = %d \n", t, i, t * i);       // Print table

        }
    }
}
