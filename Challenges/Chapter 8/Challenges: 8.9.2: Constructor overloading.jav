/* Write a second constructor as indicated. Sample output:
User1: Minutes: 0, Messages: 0
User2: Minutes: 1000, Messages: 5000 */

// ===== Code from file PhonePlan.java =====
public class PhonePlan {
   private int freeMinutes;
   private int freeMessages;

   public PhonePlan() {              //Assignment code starts here
       freeMinutes  = 0;
       freeMessages = 0;
    }                               //Assignment code ends here

    // FIXME: Create a second constructor with numMinutes and numMessages parameters.

   public PhonePlan(int Mins,int Mess) {
      freeMinutes = Mins;
      freeMessages = Mess;
   }

   public void print() {
      System.out.println("Minutes: " + freeMinutes + ", Messages: " + freeMessages);
   }
}
// ===== end =====

// ===== Code from file CallPhonePlan.java =====
public class CallPhonePlan {
   public static void main(String [] args) {
      PhonePlan user1Plan = new PhonePlan(); // Calls default constructor
      PhonePlan user2Plan = new PhonePlan(1000, 5000); // Calls newly-created constructor

      System.out.print("User1: ");
      user1Plan.print();

      System.out.print("User2: ");
      user2Plan.print();
   }
}
// ===== end =====
