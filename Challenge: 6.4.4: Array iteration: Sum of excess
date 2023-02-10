/* Array testGrades contains NUM_VALS test scores. Assign sumExtra with 0. Then, write a for loop that sets sumExtra to the total extra credit received. 
Full credit is 100, so anything over 100 is extra credit. Ex: If testGrades = {101, 83, 107, 90}, then sumExtra = 8, because 1 + 0 + 7 + 0 is 8. */

import java.util.Scanner;

public class SumOfExcess {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int[] testGrades = new int[NUM_VALS];
      int i;
      int sumExtra; // Assign sumExtra with 0 before your for loop

      for (i = 0; i < testGrades.length; ++i) {
         testGrades[i] = scnr.nextInt();
      }
      
      sumExtra = 0;                                   //Assignment Code starts here
      
      for (i = 0; i < testGrades.length; ++i) {
         if (testGrades[i] > 100) {
            int extra = testGrades[i] - 100;
            sumExtra = extra + sumExtra;
         }
      }                                              //Assignment code ends here
      
      System.out.println("sumExtra: " + sumExtra);
   }
}
