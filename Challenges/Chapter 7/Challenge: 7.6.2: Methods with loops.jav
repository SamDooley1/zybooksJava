/* Level 1
Define the method outputValue() that takes one string and one integer parameter and outputs the string that number of times, 
each followed by a newline. The method does not return any value.

Ex: If the input is rice 2, then the output is:

rice
rice
Note: Assume num is greater than 0. */

import java.util.Scanner;

public class ValuePrinter {
   public static void outputValue(String str, int num) {            //Assignment code starts here
      
      for (int i = 0; i < num; ++i) {
         System.out.println(str);
      }
   }                                                                //Asssignment code ends here

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String str;
   	int num;

   	str = scnr.next();
   	num = scnr.nextInt();
      outputValue(str, num);
   }
}

/* Level 2
Define the method printVal() that takes two integer parameters and outputs the product of all negative integers 
starting with the first and ending with the second parameter. If no negative integers exist, product is 1. End with a newline. 
The method does not return any value.

Ex: If the input is -4 7, then the output is:

24
Note: Negative numbers are less than 0. */

import java.util.Scanner;

public class ValuePrinter {
   public static void printVal(int number1, int number2) {        //Assignment code starts here
      int result = 1;
    
      for (int i = number1; i < 0 && i <= number2; ++i) {
            result = result * i;
      }
      
      if (number1 > 0 && number2 > 0) {
         System.out.println("1");
         }
      
      else {
         System.out.println(result);
      }
      
   }                                                                //Assignment code ends here
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int number1;
   	int number2;

   	number1 = scnr.nextInt();
   	number2 = scnr.nextInt();
      printVal(number1, number2);
   }
}

/* Level 3
Define the method findHighestNum() with a Scanner parameter that reads integers from input until a negative integer is read. 
The method returns the largest of the integers read.

Ex: If the input is 15 55 75 -65 15 50, then the output is:

75
Note: Negative numbers are less than 0. */

import java.util.Scanner;

public class HighestNumFinder {
   public static int findHighestNum(Scanner scnr) {
      int userInput = 0;
      int highNum = 0;
      
      while (userInput >= 0) {
         
         if (userInput > highNum) {
            highNum = userInput;
         }
         
         if (userInput < 0) {
            break;
         }
         userInput = scnr.nextInt();
      }
      
      return highNum;
   }
   

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int maxVal;
      
      maxVal = findHighestNum(scnr);
      
      System.out.println(maxVal);
   }
}

/* Level 4
Define the method inspectVals() with a Scanner parameter that reads integers from input until -1 is read. 
The method returns true if all integers read before -1 are positive. Otherwise, the method returns false.

Ex: If the input is 5 55 40 -1, then the output is:

All true
Note: Positive numbers are greater than zero. */

