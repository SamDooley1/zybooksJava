/* Write a program that takes in a line of text as input, and outputs that line of text in reverse. The program repeats, ending when the user enters "Done", "done", or "d" for the line of text.

Ex: If the input is:

Hello there
Hey
done
the output is:

ereht olleH
yeH */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      
      String input;
      int i;
      
      input = scnr.nextLine();
      
      while (!input.equals("done") || !input.equals("Done") || !input.equals("d")) {
         for (i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
         }
         System.out.println("");
         input = scnr.nextLine();
         if (input.equals("done") || input.equals("Done") || input.equals("d")){
            break;
         }
      }  
   }
}
