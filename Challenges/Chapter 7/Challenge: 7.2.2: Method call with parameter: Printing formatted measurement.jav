/* Define a method printFeetInchShort(), with int parameters numFeet and numInches, that prints using ' and " shorthand. 
End with a newline. Remember to use println instead of print to output a newline. Ex: printFeetInchShort(5, 8) prints:
5' 8"
Hint: Use \" to print a double quote. */

import java.util.Scanner;

public class HeightPrinter {
   public static void printFeetInchShort(int userFeet, int userInches) {        //Assignment code starts here
      System.out.println(userFeet + "'" + " " + userInches + "\"");
   }                                                                            //Assignment code ends here

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userFeet;
      int userInches;

      userFeet = scnr.nextInt();
      userInches = scnr.nextInt();

      printFeetInchShort(userFeet, userInches);  // Will be run with (5, 8), then (4, 11)
   }
}
