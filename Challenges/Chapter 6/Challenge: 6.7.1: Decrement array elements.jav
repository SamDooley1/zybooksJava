/*Write a loop that subtracts 1 from each element in lowerScores. If the element was already 0 or negative, assign 0 to the element. 
Ex: lowerScores = {5, 0, 2, -3} becomes {4, 0, 1, 0}. */

import java.util.Scanner;
public class StudentScores {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] lowerScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < lowerScores.length; ++i) {
         lowerScores[i] = scnr.nextInt();
      }

      for (i = 0; i < lowerScores.length; ++i) {        //Assignment code starts here
         if (lowerScores[i] <= 0) {
            lowerScores[i] = 0;
         }
         else {
            lowerScores[i] = lowerScores[i] - 1;
         }
      }                                                 //Assignment code ends here

      for (i = 0; i < lowerScores.length; ++i) {
         System.out.print(lowerScores[i] + " ");
      }
      System.out.println();
   }
}
