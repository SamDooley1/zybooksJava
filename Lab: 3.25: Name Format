/* Many documents use a specific format for a person's name. Write a program whose input is:

firstName middleName lastName

and whose output is:

lastName, firstInitial.middleInitial.

Ex: If the input is:

Pat Silly Doe
the output is:

Doe, P.S.
If the input has the form:

firstName lastName

the output is:

lastName, firstInitial.

Ex: If the input is:

Julia Clark
the output is:

Clark, J. */

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

  String firstName;
  String middleName;
  String lastName;
  String name;

  name = scnr.nextLine();

  int firstSpace = name.indexOf(" ");
  firstName = name.substring(0, firstSpace);

  int secondSpace = name.indexOf(" ", firstSpace + 1);

  if (secondSpace < 0) { 
     lastName = name.substring(firstSpace + 1);
     System.out.println(lastName + ", " + firstName.charAt(0) + ".");
  }
  else {
     middleName = name.substring(firstSpace, secondSpace);
     lastName = name.substring(secondSpace + 1);
     System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(1) + ".");
  }
   }
}
