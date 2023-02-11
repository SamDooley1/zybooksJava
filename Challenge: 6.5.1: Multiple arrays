/* Multiply each element in origList with the corresponding value in offsetAmount. Print each product followed by a semicolon (no spaces).

Ex: If the input is:
4 5 10 12
2 4 7 3

then output is:
8;20;70;36; */

import java.util.Scanner;

public class ComputeOffset {

   public static void main(String[] args) {
      final int NUM_VALS = 4;
      int[] origList = new int[NUM_VALS];
      int[] offsetAmount = new int[NUM_VALS];
      int i;
      Scanner input = new Scanner(System.in);

      origList[0] = input.nextInt();
      origList[1] = input.nextInt();
      origList[2] = input.nextInt();
      origList[3] = input.nextInt();

      offsetAmount[0] = input.nextInt();
      offsetAmount[1] = input.nextInt();
      offsetAmount[2] = input.nextInt();
      offsetAmount[3] = input.nextInt();

      for (i = 0; i < origList.length; ++i) {                        //Assignment code starts here
         System.out.print(origList[i] * offsetAmount[i] + ";");
      }                                                              //Assignment code ends here

      System.out.println();
  }
}



/* For any element in keysList with a value smaller than 60, print the corresponding value in itemsList, followed by a comma (no spaces).

Ex: If the input is:
32 105 101 35
10 20 30 40
the output is:
10,40, */

import java.util.Scanner;

public class Compare {

   public static void main(String args[]) {
      final int SIZE_LIST = 4;
      int[] keysList = new int[SIZE_LIST];
      int[] itemsList = new int[SIZE_LIST];
      int i;
      Scanner input = new Scanner(System.in);

      keysList[0] = input.nextInt();
      keysList[1] = input.nextInt();
      keysList[2] = input.nextInt();
      keysList[3] = input.nextInt();

      itemsList[0] = input.nextInt();
      itemsList[1] = input.nextInt();
      itemsList[2] = input.nextInt();
      itemsList[3] = input.nextInt();

      for (i = 0; i < keysList.length; ++i) {                  //Assignment code starts here                        
         if (keysList[i] < 60) {
         System.out.print(itemsList[i] + ",");
         }
      }                                                        //Assignment code ends here

      System.out.println();
   }

}
