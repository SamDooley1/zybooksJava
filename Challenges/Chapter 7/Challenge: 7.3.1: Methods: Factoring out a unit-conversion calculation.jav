/* Write a method so that the main() code below can be replaced by the simpler code that calls method mphAndMinutesToMiles(). Original main():

public class CalcMiles {
   public static void main(String [] args) {
      double milesPerHour;
      double minutesTraveled;
      double hoursTraveled;
      double milesTraveled;

      milesPerHour = scnr.nextDouble();
      minutesTraveled = scnr.nextDouble();

      hoursTraveled = minutesTraveled / 60.0;
      milesTraveled = hoursTraveled * milesPerHour;

      System.out.println("Miles: " + milesTraveled);
   }
} */

import java.util.Scanner;

public class CalcMiles {
   public static double mphAndMinutesToMiles(double milesPerHour, double minutesTraveled) {   //Assignment code starts here
      double hoursTraveled = minutesTraveled / 60.0;
      double milesTraveled = hoursTraveled * milesPerHour;
      
      return milesTraveled;
   }                                                                                          //Assignment code ends here  

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      double milesPerHour;
      double minutesTraveled;

      milesPerHour = scnr.nextDouble();
      minutesTraveled = scnr.nextDouble();

      System.out.println("Miles: " + mphAndMinutesToMiles(milesPerHour, minutesTraveled));
   }
}
