/* Given main(), define the Artist class (in file Artist.java) with constructors to initialize an artist's information, 
get methods, and a printInfo() method. The default constructor should initialize the artist's name to "unknown" and the 
years of birth and death to -1. printInfo() displays "Artist:", then a space, then the artist's name, then another space, 
then the birth and death dates in one of three formats:

(XXXX to YYYY) if both the birth and death years are nonnegative
(XXXX to present) if the birth year is nonnegative and the death year is negative
(unknown) otherwise
Define the Artwork class (in file Artwork.java) with constructors to initialize an artwork's information, get methods, 
and a printInfo() method. The default constructor should initialize the title to "unknown", the year created to -1. 
printInfo() displays an artist's information by calling the printInfo() method in Artist.java, followed by the artwork's 
title and the year created. Declare a private field of type Artist in the Artwork class.

Ex: If the input is:

Pablo Picasso
1881
1973
Three Musicians
1921
the output is:

Artist: Pablo Picasso (1881 to 1973)
Title: Three Musicians, 1921
Ex: If the input is:

Brice Marden
1938
-1
Distant Muses 
2000
the output is:

Artist: Brice Marden (1938 to present)
Title: Distant Muses, 2000
Ex: If the input is:

Banksy
-1
-1
Balloon Girl
2002
the output is:

Artist: Banksy (unknown)
Title: Balloon Girl, 2002 */

//ArtworkLabel.java
import java.util.Scanner;

public class ArtworkLabel {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String userTitle, userArtistName;
      int yearCreated, userBirthYear, userDeathYear;

      userArtistName = scnr.nextLine();
      userBirthYear = scnr.nextInt();
      scnr.nextLine();
      userDeathYear = scnr.nextInt();
      scnr.nextLine();
      userTitle = scnr.nextLine();
      yearCreated = scnr.nextInt();

      Artist userArtist = new Artist(userArtistName, userBirthYear, userDeathYear);

      Artwork newArtwork = new Artwork(userTitle, yearCreated, userArtist);

      newArtwork.printInfo();
   }
}

//Artist.java
public class Artist {
   // TODO: Declare private fields - artistName, birthYear, deathYear
   private String artistName;
   private int birthYear;
   private int deathYear;

   // TODO: Define default constructor
   public Artist() {
      artistName = "unknown";
      birthYear = -1;
      deathYear = -1;
   }

   // TODO: Define second constructor to initialize 
   //       private fields (artistName, birthYear, deathYear)
   public Artist(String artistName, int birthYear, int deathYear) {
      this.artistName = artistName;
      this.birthYear = birthYear;
      this.deathYear = deathYear;
   }
   
   // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
   public String getName() {
      return artistName;
   }
   
   public int getBirthYear() {
      return birthYear;
   }
   
   public int getDeathYear() {
      return deathYear;
   }

   // TODO: Define printInfo() method
   //       If deathYear is entered as -1, only print birthYear
   public void printInfo() {
      
      System.out.print("Artist: " + artistName);
      
      if (deathYear == birthYear) {
         System.out.println(" (unknown)");
      }
      
      else if (deathYear == -1) {
         System.out.println(" (" + birthYear + " to present)");
      }
      
      else {
         System.out.println(" (" + birthYear + " to " + deathYear + ")");
      }
   }
}

//Artwork.java
import java.util.Scanner;

public class ArtworkLabel {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String userTitle, userArtistName;
      int yearCreated, userBirthYear, userDeathYear;

      userArtistName = scnr.nextLine();
      userBirthYear = scnr.nextInt();
      scnr.nextLine();
      userDeathYear = scnr.nextInt();
      scnr.nextLine();
      userTitle = scnr.nextLine();
      yearCreated = scnr.nextInt();

      Artist userArtist = new Artist(userArtistName, userBirthYear, userDeathYear);

      Artwork newArtwork = new Artwork(userTitle, yearCreated, userArtist);

      newArtwork.printInfo();
   }
}
