/* Given a sorted list of integers, output the middle integer. A negative number indicates the end of the input 
(the negative number is not a part of the sorted list). Assume the number of integers is always odd.

Ex: If the input is:

2 3 4 8 11 -1 
the output is:

Middle item: 4
The maximum number of list values for any test case should not exceed 9. If exceeded, output "Too many numbers".

Hint: First read the data into an array. Then, based on the array's size, find the middle item. */


import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userVals = new int[11];        
      int i;
      int userInput;
      int count = 0;
      int midInt;
      
      for (i = 0; i < userVals.length; ++i) {
         userInput = scnr.nextInt();
         if (userInput < 0) {
            break;
         }
         count++;
         userVals[i] = userInput;
      }
      
      midInt = count / 2;
      
      if (count > 9) {
         System.out.println("Too many numbers");
      }
      
      else {
      System.out.println("Middle item: " + userVals[midInt]);
      }
   }
}
