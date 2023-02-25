/* level 1
In the class definition, initialize the private fields areaCode (integer) and number (integer) with the default values 0 and -1, respectively.

Ex: If the input is 733 6059296, then the output is:

Default values: 
Area code: 0, Number: -1
After mutator methods: 
Area code: 733, Number: 6059296

Note: The class's print() method is called before and after the input is passed to the setters. */

// Mail.java
import java.util.Scanner;

public class Mail {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int newAreaCode;
		int newNumber;
      Voicemail voicemail1 = new Voicemail();
      
      System.out.println("Default values: ");
      voicemail1.print();
      
      newAreaCode = scnr.nextInt();
		newNumber = scnr.nextInt();
      
      voicemail1.setAreaCode(newAreaCode);
		voicemail1.setNumber(newNumber);
      
      System.out.println("After mutator methods: ");
      voicemail1.print();
   }
}

//Voicemail.java
public class Voicemail {

   private int areaCode = 0;                            //Assignment code starts here
	private int number = -1;                              //Assignment code ends here

   public void setAreaCode(int voicemailAreaCode) {
		areaCode = voicemailAreaCode;
	}
	
	public void setNumber(int voicemailNumber) {
		number = voicemailNumber;
	}
   
   public void print() {
      System.out.println("Area code: " + areaCode + ", Number: " + number);
   }
}

/* level 2
Define a default constructor that initializes the fields state (string) and owner (string) with the default values "Unknown" and "Unknown", respectively.

Ex: If the input is NH Gus, then the output is:

Default values: 
State: Unknown, Name: Unknown's Delicatessen
After mutator methods: 
State: NH, Name: Gus's Delicatessen

Note: The class's print() method is called before and after the input is passed to the setters.  */

//MealEstablishments.java
import java.util.Scanner;

public class LocalMealEstablishments {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String newState;
		String newOwner;
      MealEstablishment myMealEstablishment = new MealEstablishment();
      
      System.out.println("Default values: ");
      myMealEstablishment.print();
      
      newState = scnr.next();
		newOwner = scnr.next();
      
      myMealEstablishment.setState(newState);
		myMealEstablishment.setOwner(newOwner);
      
      System.out.println("After mutator methods: ");
      myMealEstablishment.print();
   }
}

//MealEstablishments.java
public class MealEstablishment {
   private String state;
	private String owner;
   
   public MealEstablishment() {         //Asignment code starts here
      state = "Unknown";
      owner = "Unknown";
   }                                    //Assignment code ends here
   

   public void setState(String mealEstablishmentState) {
		state = mealEstablishmentState;
	}
	
	public void setOwner(String mealEstablishmentOwner) {
		owner = mealEstablishmentOwner;
	}
   
   public void print() {
      System.out.println("State: " + state + ", Name: " + owner + "'s Delicatessen");
   }
}
