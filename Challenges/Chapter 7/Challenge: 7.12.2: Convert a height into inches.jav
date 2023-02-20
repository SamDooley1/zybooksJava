/* Write a second convertToInches() with two double parameters, numFeet and numInches, that returns the total number of inches. 
Ex: convertToInches(4.0, 6.0) returns 54.0 (from 4.0 * 12 + 6.0). */

import java.util.Scanner;

public class FunctionOverloadToInches {

   public static double convertToInches(double numFeet) {
      return numFeet * 12.0;
   }

   public static double convertToInches(double numFeet, double numInches) {
      return numFeet * 12 + numInches;
   }

   public static void main (String [] args) {
      double totInches;

      totInches = convertToInches(4.0, 6.0);
      System.out.println("4.0, 6.0 yields " + totInches);

      totInches = convertToInches(5.8);
      System.out.println("5.8 yields " + totInches);
   }
}
