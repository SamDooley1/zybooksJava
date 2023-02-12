/* Write a program that inputs an integer (0 - 9999) and outputs the number of digits.

Ex: If the input is:

7493
the output is:

4 digits
Ex: If the input is:

7
the output is:

1 digit */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input = scnr.nextInt();
      
      if (input >= 0 && input <= 9) {
         System.out.println("1 digit");
      }
      else if (input >= 10 && input <= 99) {
         System.out.println("2 digits");
      } 
      else if (input >= 100 && input <= 999) {
         System.out.println("3 digits");
      }
      else if (input >= 1000 && input <= 9999) {
         System.out.println("4 digits");
      }
   }
}
