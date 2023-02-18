/* Assign numMatches with the number of elements in userValues that equal matchValue. userValues has NUM_VALS elements. 
Ex: If userValues is {2, 1, 2, 2} and matchValue is 2, then numMatches should be 3.

Your code will be tested with the following values:
matchValue: 2, userValues: {2, 1, 2, 2} (as in the example program above)
matchValue: 0, userValues: {0, 0, 0, 0}
matchValue: 10, userValues: {20, 50, 70, 100} */

import java.util.Scanner;

public class FindMatchValue {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);

      final int NUM_VALS = 4;
      int[] userValues = new int[NUM_VALS];
      int i;
      int matchValue;
      int numMatches; // Assign numMatches with 0 before your for loop

      matchValue = scnr.nextInt();
      for (i = 0; i < userValues.length; ++i) {
         userValues[i] = scnr.nextInt();
      }

      numMatches = 0;                                //Assignment code starts here
      for (i = 0; i < userValues.length; ++i) {
         if ( userValues[i] == matchValue) {
            ++numMatches;
         }
      }                                              //Assignment code ends here

      System.out.println("matchValue: " + matchValue + ", numMatches: " + numMatches);
   }
}
