/* Write a program that creates a login name for a user, given the user's first name, last name, and a four-digit integer as input. Output the login name, which is made up of the first five letters of the last name, followed by the first letter of the first name, and then the last two digits of the number (use the % operator). If the last name has less than five letters, then use all letters of the last name.

Ex: If the input is:

Michael Jordan 1991
the output is:

Your login name: JordaM91
Ex: If the input is:

Kanye West 2024
the output is:

Your login name: WestK24 */

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
       
      String userFirstName;
      String userLastName;
      int birthYear;
      String loginName;
        
      userFirstName = scnr.next();
      userLastName = scnr.next();
      birthYear = scnr.nextInt();
		        
		if (userLastName.length()<5) {
         loginName = userLastName;
		}
      else {
         loginName = userLastName.substring(0,5);
      }
      loginName = loginName + userFirstName.charAt(0);
      loginName = loginName + (birthYear % 100);
      
      System.out.println("Your login name: " + loginName);
	}
}
