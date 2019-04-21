import java.util.Scanner;

public class Reversestring
{
    public static void main(String []args)
    {
      String revname = "", orgname;                      //define string variable
      int i,len;                                        // define integer variable

        Scanner input = new Scanner(System.in);         // define Scanner variable input

        System.out.print("Enter a String to Reverse : ");
        orgname = input.nextLine();                     // pass input line value to ORGNAME

        len = orgname.length();                         // find the length of the string using length() function
        System.out.println("Length = " +len);

        for(i=len-1; i>=0  ;i--)                        // Run the for loop till value of length is more then 0
        {
            revname = revname + orgname.charAt(i);      // find the  single char of string using charAt() function in reverse order
                                                        // and add it into REVNAME
        }

        System.out.print("Reverse of Entered String is : " +revname);     //  print reverse STRING
    }
}




