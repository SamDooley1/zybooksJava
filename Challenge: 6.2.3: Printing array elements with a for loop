/* Write a for loop to print all elements in courseGrades, following each element with a space (including the last). Print forwards, then backwards. End each loop with a newline. Ex: If courseGrades = {7, 9, 11, 10}, print:
7 9 11 10 
10 11 9 7 

Hint: Use two for loops. Second loop starts with i = courseGrades.length - 1. (Notes) */

import java.util.Scanner;

public class CourseGradePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int [] courseGrades = new int[NUM_VALS];
      int i;

      for (i = 0; i < courseGrades.length; ++i) {
         courseGrades[i] = scnr.nextInt();
      }

      for (i = 0; i < courseGrades.length; ++i) {       //Assignment code starts here
         System.out.print(courseGrades[i] + " ");
      }
      
      System.out.println("");
      
      for (i = courseGrades.length-1; i >= 0; --i) {
         System.out.print(courseGrades[i] + " ");
      }
      
      System.out.println("");                           //Assignment code ends here
   }
}
