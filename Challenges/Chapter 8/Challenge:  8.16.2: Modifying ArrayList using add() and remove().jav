/* Modify the existing ArrayLists's contents, by erasing the second element, then inserting 100 and 102 in the shown locations. Use ArrayList's remove() and add() only. Sample output of below program with input 101 200 103:
100 101 102 103 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListADT {
   public static void printArrayList(ArrayList<Integer> numsList) {
      int i;

      for (i = 0; i < numsList.size(); ++i) {
         System.out.print(numsList.get(i));
         System.out.print(" ");
      }

      System.out.println("");
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> numsList = new ArrayList<Integer>();
      int userInput;
      int i;

      for (i = 0; i < 3; ++i) {
         userInput = scnr.nextInt();
         numsList.add(userInput);
      }

      numsList.remove(1);                           //Assignment code starts here
      numsList.add(0, new Integer(100));
      numsList.add(2, new Integer(102));            //Assignment code ends here

      printArrayList(numsList);
   }
}
