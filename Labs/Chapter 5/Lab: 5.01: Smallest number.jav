/* Write a program whose inputs are three integers, and whose output is the smallest of the three values.

Ex: If the input is:

7 15 3
the output is:

3 */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      
      int int1 = scnr.nextInt();
      int int2 = scnr.nextInt();
      int int3 = scnr.nextInt();
      int minInt = int1;
      
      if (int2 < minInt) {
         minInt = int2;
      }
      if (int3 < minInt) {
         minInt = int3;
      }
      System.out.println(minInt); 
   }
}
