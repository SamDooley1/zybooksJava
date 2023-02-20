/* Complete the second printSalutation() method to print the following given personName "Holly" and customSalutation "Welcome":
Welcome, Holly
End with a newline. */

import java.util.Scanner;

public class MultipleSalutations {
   public static void printSalutation(String personName) {
      System.out.println("Hello, " + personName);
   }

   //Define void printSalutation(String personName, String customSalutation)...

   public static void printSalutation(String personName, String customSalutation){
      System.out.println(customSalutation + ", " + personName);
   }

   public static void main (String [] args) {
      printSalutation("Holly", "Welcome");
      printSalutation("Sanjiv");
   }
}
