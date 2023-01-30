/* Write a program whose input is two integers, and whose output is the first integer and subsequent increments of 5 as long as the value is less than or equal to the second integer.

Ex: If the input is:

-15 10
the output is:

-15 -10 -5 0 5 10
Ex: If the second integer is less than the first as in:

20 5
the output is:

Second integer can't be less than the first.
For coding simplicity, output a space after every integer, including the last. */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);

      int num1=scnr.nextInt();
      int num2=scnr.nextInt();

      if(num2 < num1) {
         System.out.println("Second integer can't be less than the first.");
      }
      
      else {
         System.out.print(num1 + " ");
         while(num2 >= num1 +5) {
            num1 = num1 + 5;
            System.out.print(num1+  " ");
         }
         System.out.println("");
      }
   }
}
