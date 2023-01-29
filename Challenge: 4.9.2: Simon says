/* "Simon Says" is a memory game where "Simon" outputs a sequence of 10 characters (R, G, B, Y) and the user must repeat the sequence. Create a for loop that compares the two strings starting from index 0. For each match, add one point to userScore. Upon a mismatch, exit the loop using a break statement. Assume simonPattern and userPattern are always the same length. Ex: The following patterns yield a userScore of 4:
simonPattern: RRGBRYYBGY
userPattern:  RRGBBRYBGY */

import java.util.Scanner;

public class SimonSays {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String simonPattern;
      String userPattern;
      int userScore;
      int i;

      userScore = 0;

      simonPattern = scnr.next();
      userPattern  = scnr.next();
      
      for (i = 0; i < simonPattern.length(); ++i) {                             //Assignment code starts here
         if (simonPattern.charAt(i) == userPattern.charAt(i)) {
         ++userScore;
         }
         else {
            break;
         }
      }                                                                         //Assignment code ends here
      
      System.out.println("userScore: " + userScore);

      return;
   }
}
