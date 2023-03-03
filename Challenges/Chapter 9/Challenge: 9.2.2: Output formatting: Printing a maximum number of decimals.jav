/* Write a single statement that prints outsideTemperature with 2 decimals. End with newline. Sample output with input 103.46432:
103.46 */

import java.util.Scanner;

public class OutsideTemperatureFormatting {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double outsideTemperature;

      outsideTemperature = scnr.nextDouble();

      System.out.printf("%.2f\n", outsideTemperature); //Assignment code here

   }
}
