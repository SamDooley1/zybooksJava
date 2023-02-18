/* Double any element's value that is less than controlValue. 
Ex: If controlValue = 10, then dataPoints = {2, 12, 9, 20} becomes {4, 12, 18, 20}. */

import java.util.Scanner;
public class StudentScores {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_POINTS = 4;
      int[] dataPoints = new int[NUM_POINTS];
      int controlValue;
      int i;

      controlValue = scnr.nextInt();

      for (i = 0; i < dataPoints.length; ++i) {
         dataPoints[i] = scnr.nextInt();
      }

      for (i = 0; i < dataPoints.length; ++i) {     //Assignment code starts here
         if (dataPoints[i] < controlValue) {
            dataPoints[i] = dataPoints[i] * 2;
         }
      }                                             //Assignment code ends here

      for (i = 0; i < dataPoints.length; ++i) {
         System.out.print(dataPoints[i] + " ");
      }
      System.out.println();
   }
}
