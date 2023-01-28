/* Given numRows and numColumns, print a list of all seats in a theater. Rows are numbered, columns lettered, as in 1A or 3E. Print a space after each seat, including after the last. Use separate print statements to print the row and column. Ex: numRows = 2 and numColumns = 3 prints:
1A 1B 1C 2A 2B 2C */

import java.util.Scanner;
public class NestedLoops {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();
      
      for (int i = 1; i <= numRows; i++) {                      //Assignment code starts here
         currentColumnLetter = 'A';
         for (int x = 1; x <= numColumns; x++) {
            System.out.print(i);
            System.out.print(currentColumnLetter + " ");
            currentColumnLetter++;
         }
      }                                                         //Assignment code ends here
         
      System.out.println("");
   }
}
