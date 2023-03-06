/* Given a text file containing the availability of food items, write a program that reads the information from the text file and outputs the available food items. The program first reads the name of the text file from the user. The program then reads the text file, stores the information into four separate arrays, and outputs the available food items in the following format: name (category) -- description

Assume the text file contains the category, name, description, and availability of at least one food item, separated by a tab character.

Ex: If the input of the program is:

food.txt
and the contents of food.txt are:

Sandwiches    Ham sandwich    Classic ham sandwich    Available
Sandwiches    Chicken salad sandwich  Chicken salad sandwich  Not available
Sandwiches    Cheeseburger    Classic cheeseburger    Not available
Salads    Caesar salad    Chunks of romaine heart lettuce dressed with lemon juice    Available
Salads    Asian salad Mixed greens with ginger dressing, sprinkled with sesame    Not available
Drinks    Water   16oz bottled water  Available
Drinks    Coca-Cola   16oz Coca-Cola  Not available
Mexican food    Chicken tacos   Grilled chicken breast in freshly made tortillas    Not available
Mexican food    Beef tacos  Ground beef in freshly made tortillas   Available
Vegetarian    Avocado sandwich    Sliced avocado with fruity spread   Not available
the output of the program is:

Ham sandwich (Sandwiches) -- Classic ham sandwich
Caesar salad (Salads) -- Chunks of romaine heart lettuce dressed with lemon juice
Water (Drinks) -- 16oz bottled water
Beef tacos (Mexican food) -- Ground beef in freshly made tortillas */

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      String[] category = new String[22];
      String[] name = new String[22];
      String[] description = new String[22];
      String[] availability = new String[22];
      String fileName;
      int count = 0;
      
      fileName = scnr.nextLine();
      Scanner fileInput = new Scanner(new File(fileName));
      
      while (fileInput.hasNextLine()) {
         String line = fileInput.nextLine();
         
         String[] colums = line.split("\t");
         
         category[count] = colums[0];
         
         name[count] = colums[1];
         
         description[count] = colums[2];
         
         availability[count] = colums[3];
         
         count++;
      }
      
      for (int i = 0; i < count; i++) {
         if (availability[i].equals("Available")) {
            System.out.println(name[i] + " (" + category[i] + ") -- " + description[i]);
         }
      }
      
   }
}
