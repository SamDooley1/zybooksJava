Level 1
/* Write a for loop that prints: 1 2 … lastNumber

Ex: If the input is:

4

the output is:

1 2 3 4 */

import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int lastNumber;
      int i;
      
      Scanner input = new Scanner(System.in);
      lastNumber = input.nextInt();
      
      for (i = 1; i <= lastNumber; ++i) {               //Level code here
         System.out.print(i + " ");
      }
   }
}


Level 2
/* Write code that prints: numVal … 2 1
Print a newline after each number.

Ex: If the input is:

3

the output is:

3
2
1 */

import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int numVal;
      int i;
      
      Scanner input = new Scanner(System.in);
      numVal = input.nextInt();
      
      for (i = numVal; i > 0; --i) {                    //Level code here
         System.out.println(i);
      }
   }
}


Level 3
/* Write code that prints: Ready! countNum … 2 1 Blastoff!
Your code should contain a for loop. Print a newline after each number and after each line of text.

Ex: If the input is:

3

the output is:

Ready!
3
2
1
Blastoff! */

import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int countNum;
      int i;
      
      Scanner input = new Scanner(System.in);
      countNum = input.nextInt();
      
      System.out.println("Ready!");                     //Level code starts here
      
      for (i = countNum; i > 0; --i) {
         System.out.println(i);
      }
      
      System.out.println("Blastoff!");                  //Level code ends here
   }
}


Level 4
/* Write a for loop that prints firstNumber … -1 0.

Ex: If the input is:

-3

the output is:

-3 -2 -1 0 */

import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int firstNumber;
      int i;
      
      Scanner input = new Scanner(System.in);
      firstNumber = input.nextInt();
      
      for (i = firstNumber; i < 1; ++i) {               //Level code here
         System.out.print(i + " ");
      }
   }
}


Level 5
/*Write a for loop that prints from initialNumber to endNumber.

Ex: If the input is:

-3 1

the output is:

-3 -2 -1 0 1 */

import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int initialNumber;
      int endNumber;
      int i;
      
      Scanner input = new Scanner(System.in);
      initialNumber = input.nextInt();
      endNumber = input.nextInt();
      
      for (i = initialNumber; i <= endNumber; ++i) {                                //Level code here
         System.out.print(i + " ");
      }
   }
}
