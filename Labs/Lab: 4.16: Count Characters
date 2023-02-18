/* Write a program whose input is a character and a string, and whose output indicates the number of times the character appears in the string. 
The output should include the input character and use the plural form, n's, if the number of times the characters appears is not exactly 1.

Ex: If the input is:

n Monday
the output is:

1 n
Ex: If the input is:

z Today is Monday
the output is:

0 z's
Ex: If the input is:

n It's a sunny day
the output is:

2 n's
Case matters.

Ex: If the input is:

n Nobody
the output is:

0 n's
n is different than N. */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      char userLetter;
      String userWord;
      int i;
      int wordCount;
      
      userLetter = scnr.next().charAt(0);
      userWord = scnr.nextLine();
      wordCount = 0;
      
      for (i = 0; i < userWord.length(); i = i + 1) {
         if (userWord.charAt(i) == userLetter){
            ++wordCount;
         }}
         
      if (wordCount == 0) {
         System.out.println(wordCount + " " + userLetter + "'s");
      }
      else if (wordCount < 2) {
         System.out.println(wordCount + " " + userLetter);
      }
      else {
         System.out.println(wordCount + " " + userLetter + "'s");
      }
   }
}
