/* Write code that uses the input string stream inSS to read input data from string userInput, 
and updates variables userMonth, userDate, and userYear. Sample output if the input is "Jan 12 1992":
Month: Jan
Date: 12
Year: 1992 */

import java.util.Scanner;

public class StringInputStream {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      Scanner inSS = null;
      String userInput;
      String userMonth;
      int userDate;
      int userYear;

      userInput = scnr.nextLine();
      inSS = new Scanner(userInput);

      userMonth = inSS.next();                  //Assignment code starts here
      userDate = inSS.nextInt();
      userYear = inSS.nextInt();                //Assignment code ends here

      System.out.println("Month: " + userMonth);
      System.out.println("Date: " + userDate);
      System.out.println("Year: " + userYear);
   }
}
