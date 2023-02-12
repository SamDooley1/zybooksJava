/* Write a program that first gets a list of integers from input. The input begins with an integer indicating 
the number of integers that follow. Then, get the last value from the input, which indicates a threshold. 
Output all integers less than or equal to that last threshold value. Assume that the list will always contain fewer than 20 integers.

Ex: If the input is:

5 50 60 140 200 75 100
the output is:

50,60,75,
The 5 indicates that there are five integers in the list, namely 50, 60, 140, 200, and 75. 
The 100 indicates that the program should output all integers less than or equal to 100, so the program outputs 50, 60, and 75.

For coding simplicity, follow every output value by a comma, including the last one.

Such functionality is common on sites like Amazon, where a user can filter results. */


import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userVals = new int[20];   // List of integers from input
      int numInts = scnr.nextInt();
      int i;
      int maxVal;

      for (i = 0; i < numInts; ++i) {
         userVals[i] = scnr.nextInt();
      }
      
      maxVal = scnr.nextInt();
      
      for (i = 0; i < numInts; ++i) {
         if (userVals[i] <= maxVal) {
            System.out.print(userVals[i] + ",");
         }
      }
      
      System.out.println("");
   }
}
