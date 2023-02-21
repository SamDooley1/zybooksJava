/*Complete a program that takes a weight in kilograms as input, converts the weight to pounds, 
and then outputs the weight in pounds. 1 kilogram = 2.204 pounds (lbs).

Ex: If the input is:

10
the output is:

22.040000000000003 lbs
Note: Your program must define the method
public static double kiloToPounds(double kilos) */

import java.util.Scanner;

public class Main {
   
   public static double kiloToPounds(double kilos) { 
      return (kilos * 2.204);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double kilos;
      double pounds;
      
      kilos = scnr.nextDouble();
      
      pounds = kiloToPounds(kilos);
      System.out.println(pounds + " lbs");
   }
}
