/* Level 1
Define a method findEmployeeTax() that takes one integer parameter as the person's age, and returns the person's tax percent as a double. 
The tax percent is returned as follows:

If a person's age is more than 80 years old, tax percent is 0.06.
If a person's age is between 40 and 80 years old inclusive, tax percent is 0.27.
Otherwise, tax percent is 0.4.
Ex: If the input is 85, then the output is:

0.06 */

import java.util.Scanner;

public class TaxFinder {
   public static double findEmployeeTax(int personsAge) {
      double taxPercent;
      
      if (personsAge > 80) {
          taxPercent = 0.06;
      }
      
      else if (personsAge <= 80 && personsAge >= 40) {
         taxPercent = 0.27;
      }
      
      else {
         taxPercent = 0.4;
      }
      
      return taxPercent;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int personsAge;

      personsAge = scnr.nextInt();
      
      System.out.println(findEmployeeTax(personsAge));
   }
}

/* Level 2
Define a method findParkingLot() that takes two integer parameters as the hourly parking price and the parking duration, and returns the parking lot allocation as an integer. The lot is returned as follows:

      Parking lot allocation
Price	  ≤6 hours	7-9 hours   >9 hours
< 4	        1	        2	          3
4-9	        4	        5	          6
≥10	        7	        8         	9

Ex: If the input is 3 5, then the output is:

1 */

import java.util.Scanner;

public class LotFinder {
   public static int findParkingLot(int hourlyFee, int parkingDuration) {                                   //Assignment code starts here
      
      if (hourlyFee < 4 && parkingDuration <= 6) {
         return 1;
      }
      else if (hourlyFee < 4 && (parkingDuration >= 7 && parkingDuration <= 9)) {
         return 2;
      }
      else if (hourlyFee < 4 && parkingDuration > 9) {
         return 3;
      }
      else if ((hourlyFee >= 4 && hourlyFee <= 9) && parkingDuration <= 6) {
         return 4;
      }
      else if ((hourlyFee >= 4 && hourlyFee <= 9) && (parkingDuration >= 7 && parkingDuration <= 9)) {
         return 5;
      }
      else if ((hourlyFee >= 4 && hourlyFee <= 9) && parkingDuration > 9) {
         return 6;
      }
      else if (hourlyFee >= 10 && parkingDuration <= 6) {
         return 7;
      }
      else if (hourlyFee >= 10 && (parkingDuration >= 7 && parkingDuration <= 9)) {
         return 8;
      }
      else if (hourlyFee >= 10 && parkingDuration > 9) {
         return 9;
      }
      else {
         return 0;
      }
   }                                                                                                                  //Assignment code ends here
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int hourlyFee;
      int parkingDuration;

      hourlyFee = scnr.nextInt();
      parkingDuration = scnr.nextInt();
   
      System.out.println(findParkingLot(hourlyFee, parkingDuration));
   }
}
