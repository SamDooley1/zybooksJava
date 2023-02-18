/* Complete method printPopcornTime(), with int parameter bagOunces, and void return type. If bagOunces is less than 2, print "Too small". 
If greater than 10, print "Too large". Otherwise, compute and print 6 * bagOunces followed by " seconds". End with a newline. Example output for ounces = 7:

42 seconds */

import java.util.Scanner;

public class PopcornTimer {
   public static void printPopcornTime(int bagOunces) {

      if (bagOunces < 2) {
         System.out.println("Too small");
      }
      
      else if (bagOunces > 10) {
         System.out.println("Too large");
      }
      else {
         System.out.println(6 * bagOunces + " seconds");
      }

   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userOunces;

      userOunces = scnr.nextInt();
      printPopcornTime(userOunces);
   }
}
