/* Level 1
Define a method printAirportDetails() that takes two string parameters and outputs as follows, ending with a newline. 
The method should not return any value.

Ex: If the input is EWR Newark, then the output is:

EWR is Newark's airport code. */

import java.util.Scanner;

public class AirportDetails {
   public static void printAirportDetails(String airportCode, String airportName) {
      System.out.println(airportCode + " is " + airportName + "'s airport code.");
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String airportCode;
      String airportName;
		
      airportCode = scnr.next();
      airportName = scnr.next();
		
      printAirportDetails(airportCode, airportName);
   }
}

/* Level 2
Define a method printTravelList() that takes three string parameters and outputs as follows, ending with a newline. The method should not return any value.

Ex: If the input is Turkey Zambia Korea, then the output is:

I want to travel to:
1: Turkey
2: Zambia
3: Korea */

import java.util.Scanner;

public class TravelList {
   public static void printTravelList(String country1, String country2, String country3) {
      System.out.println("I want to travel to:");
      System.out.println("1: " + country1);
      System.out.println("2: " + country2);
      System.out.println("3: " + country3);
   }

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String country1;
		String country2;
		String country3;
		
		country1 = scnr.next();
		country2 = scnr.next();
		country3 = scnr.next();
		
		printTravelList(country1, country2, country3);
	}
}

/* Level 3
Define a method printResult() that takes two double parameters, and outputs "Result: " followed by the parameters' 
sum with a precision of two digits as follows, ending with a newline.

Ex: If the input is 13.00 -1.00, then the output is:

Result: 12.00

Note:

The calculation to find the sum of two values x and y is (x + y).
Use System.out.printf("%.2f", myDouble) to output doubles with precision of two digits. */

import java.util.Scanner;

public class Result {
   public static void printResult(double x, double y) {       //Assignment code starts here
      double result = x + y;
      System.out.print("Result: ");
      System.out.printf("%.2f", result);
      System.out.println("");
   }                                                          //Assignment code ends here

   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     double numA;
     double numB;
		
     numA = scnr.nextDouble();
     numB = scnr.nextDouble();
		
     printResult(numA, numB);
	}
}

/* Level 4
Read four strings from input and call printCity() to output as follows.

Ex: If the input is DeLand Providence Stetson Brown, then the output is:

DeLand is the location of Stetson University.
Providence is the location of Brown University. */

import java.util.Scanner;

public class City {

	public static void printCity(String var1, String var2) {
		System.out.println(var1 + " is the location of " + var2 + " University.");
	}

	public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String city1 = scnr.next();
      String city2 = scnr.next();
      String uni1 = scnr.next();
      String uni2 = scnr.next();
      
      printCity(city1, uni1);
      printCity(city2, uni2);

	}
}
