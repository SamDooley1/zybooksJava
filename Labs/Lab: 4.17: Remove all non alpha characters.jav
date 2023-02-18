/* Write a program that removes all non alpha characters from the given input.

Ex: If the input is:

-Hello, 1 world$!
the output is:

Helloworld */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String str1;
      String newStr;
      int i;
      
      str1 = scnr.nextLine();
      newStr = "";
      
      for (i = 0; i < str1.length(); i++) {
            boolean b1 = Character.isAlphabetic(str1.charAt(i));
           
            if (b1) {
                newStr += str1.substring(i, i + 1);
            }
         }
        System.out.println(newStr);
   }
}
