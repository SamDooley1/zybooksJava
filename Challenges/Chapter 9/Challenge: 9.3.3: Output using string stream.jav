/* Write code that inserts userItem into the output string stream itemsOSS until the user enters "Exit". 
Each item should be followed by a space. Sample output if user input is "red purple yellow Exit":
red purple yellow */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class StringStreamOutput {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userItem;

      StringWriter itemCharStream = new StringWriter();
      PrintWriter itemsOSS = new PrintWriter(itemCharStream);

      System.out.println("Enter items (type Exit to quit):");
      userItem = scnr.next();

      while (!userItem.equals("Exit")) {

         itemsOSS.print(userItem + " "); //Assignment code here

         userItem = scnr.next();
      }

      userItem = itemCharStream.toString();
      System.out.println(userItem);
   }
}
