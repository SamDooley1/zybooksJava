/* Given main(), complete the Car class (in file Car.java) with methods to set and get the purchase price of a car 
(setPurchasePrice(), getPurchasePrice()), and to output the car's information (printInfo()).

Ex: If the input is:

2011
18000
2018
where 2011 is the car's model year, 18000 is the purchase price, and 2018 is the current year, the output is:

Car's information:
  Model year: 2011
  Purchase price: $18000
  Current value: $5770
Note: printInfo() should use two spaces for indentation. */

//CarValue.java
import java.util.Scanner;
import java.lang.Math;

public class CarValue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Car myCar = new Car();
      
      int userYear = scnr.nextInt();
      int userPrice = scnr.nextInt();
      int userCurrentYear = scnr.nextInt();
      
      myCar.setModelYear(userYear);
      myCar.setPurchasePrice(userPrice);
      myCar.calcCurrentValue(userCurrentYear);
      
      myCar.printInfo();
   }
}


//Car.java
public class Car {
   private int modelYear; 
   // TODO: Declare purchasePrice field (int)
   private int purchasePrice;

   private int currentValue;
   
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   
   public int getModelYear() {
      return modelYear;
   }
   
   // TODO: Define setPurchasePrice() method
   public void setPurchasePrice(int userPrice) {
      purchasePrice = userPrice;
   }
   
   // TODO: Define getPurchasePrice() method
   public int getPurchasePrice() {
      return purchasePrice;
   }
   
   
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Car depreciation formula
      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }
   
   // TODO: Define printInfo() method to output modelYear, purchasePrice, and currentValue
   public void printInfo() {
      System.out.println("Car's information:");
      System.out.println("  Model year: " + modelYear);
      System.out.println("  Purchase price: $" + purchasePrice);
      System.out.println("  Current value: $" + currentValue);
   }
   
}
