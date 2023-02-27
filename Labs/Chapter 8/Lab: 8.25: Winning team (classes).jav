/* Given main(), define the Team class (in file Team.java). For class method getWinPercentage(), the formula is:
wins / (wins + losses). Note: Use casting to prevent integer division.

For class method printStanding(), output the win percentage of the team with two digits after the decimal point and 
whether the team has a winning or losing average. A team has a winning average if the win percentage is 0.5 or greater.

Ex: If the input is:

Ravens
13
3 
where Ravens is the team's name, 13 is the number of team wins, and 3 is the number of team losses, the output is:

Win percentage: 0.81
Congratulations, Team Ravens has a winning average!
Ex: If the input is:

Angels
80
82
the output is:

Win percentage: 0.49
Team Angels has a losing average. */

//Winning team.java
import java.util.Scanner;

public class WinningTeam {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Team team = new Team();
      
      String name = scnr.next();
      int wins = scnr.nextInt();
      int losses = scnr.nextInt();
      
      team.setName(name);
      team.setWins(wins);
      team.setLosses(losses);
      
      team.printStanding();
   }
}

//team.java
public class Team {
   // TODO: Declare private fields - name, wins, losses
   private String name;
   private int wins;
   private int losses;
   
   // TODO: Define mutator methods - 
   //       setName(), setWins(), setLosses()
      public void setName(String teamName) {
         name = teamName;
      }
      
      public void setWins(int teamWins) {
         wins = teamWins;
      }
      
      public void setLosses(int teamLosses) {
         losses = teamLosses;
      }   
   
   // TODO: Define accessor methods - 
   //       getName(), getWins(), getLosses()
   public String getName() {
      return name;
   }
   
   public int getWins() {
      return wins;
   }
   
   public int getLosses() {
      return losses;
   }
   
   // TODO: Define getWinPercentage()
   public double getWinPercentage() {
      return (wins * 1.0) / (wins + losses);
   }
   
   
   // TODO: Define printStanding()
   public void printStanding() {
      Team team = new Team();
      Team studentTeam = new Team();
      int studentTeamLosses = studentTeam.getLosses();
      int studentTeamWins = studentTeam.getWins();
      
      team.setWins(wins);
      team.setLosses(losses);
      
      if (team.getWinPercentage() <= 0.5) {
         System.out.print("Win percentage: ");
         System.out.printf("%.2f\n", team.getWinPercentage());
         System.out.println("Team " + name + " has a losing average.");
      }
      
      else {
         System.out.print("Win percentage: ");
         System.out.printf("%.2f\n", team.getWinPercentage());
         System.out.println("Congratulations, Team " + name + " has a winning average!");
      }
   }  
   
}
