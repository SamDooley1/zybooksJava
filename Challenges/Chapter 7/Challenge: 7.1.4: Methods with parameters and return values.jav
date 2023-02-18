/* level 1
Define a method computeVal() that takes one integer parameter and returns the parameter minus 9.

Ex: If the input is 3, then the output is:

-6 */

import java.util.Scanner;

public class ValueComputation {
   public static int computeVal(int input) {      //assignment code starts here
      int result = input - 9;
      return result;
   }                                              //assignment code ends here

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int input;
      int result;
      
      input = scnr.nextInt();

      result = computeVal(input);

      System.out.println(result);
   }
}



/* level 2
Define a method computeNum() that takes two integer parameters and returns the sum of the two parameters minus 7.

Ex: If the input is 2 6, then the output is:

1 */

import java.util.Scanner;

public class NumberComputation {
   public static int computeNum(int input1, int input2) {     //assignment code starts here
      int result = input1 + input2 - 7;
      
      return result;
   }                                                          //assignment code ends here

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int input1;
      int input2;
      int result;
      
      input1 = scnr.nextInt();
      input2 = scnr.nextInt();

      result = computeNum(input1, input2);

      System.out.println(result);
   }
}

