/* Define a method calcPyramidVolume with double data type parameters baseLength, baseWidth, and pyramidHeight, that returns as a double the volume of a pyramid with a rectangular base. calcPyramidVolume() calls the given calcBaseArea() method in the calculation.

Relevant geometry equations:
Volume = base area x height x 1/3
Base area = base length x base width.
(Watch out for integer division). */

import java.util.Scanner;

public class CalcPyramidVolume {

   public static double calcBaseArea(double baseLength, double baseWidth) {
      return baseLength * baseWidth;
   }

   public static double calcPyramidVolume(double baseLength, double baseWidth, double pyramidHeight) {    //Assignment code starts here
      double volume;
      
      volume = calcBaseArea(baseLength, baseWidth) * pyramidHeight / 3;
      return volume;
   }                                                                                                       //Assignment code ends here

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double userLength;
      double userWidth;
      double userHeight;

      userLength = scnr.nextDouble();
      userWidth = scnr.nextDouble();
      userHeight = scnr.nextDouble();

      System.out.println("Volume: " + calcPyramidVolume(userLength, userWidth, userHeight));
   }
}
