/* Mad Libs are activities that have a person provide various words, which are then used to complete a short story in unexpected (and hopefully funny) ways.

Write a program that takes a string and an integer as input, and outputs a sentence using the input values as shown in the example below. 
The program repeats until the input string is quit and disregards the integer input that follows.

Ex: If the input is:

apples 5
shoes 2
quit 0
the output is:

Eating 5 apples a day keeps you happy and healthy.
Eating 2 shoes a day keeps you happy and healthy. */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      
      String str1 = scnr.next();
      int int1 = scnr.nextInt();
      
      while (!str1.equals("quit")) {
         System.out.println("Eating " + int1 + " " + str1 + " a day keeps you happy and healthy.");
         str1 = scnr.next();
         int1 = scnr.nextInt();
         if (str1.equals("quit")) {
            break;
         }
      }
   }
}
