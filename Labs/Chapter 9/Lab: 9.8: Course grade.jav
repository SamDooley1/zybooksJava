/* Write a program that reads the student information from a tab separated values (tsv) file. 
The program then creates a text file that records the course grades of the students. 
Each row of the tsv file contains the Last Name, First Name, Midterm1 score, Midterm2 score, 
and the Final score of a student. A sample of the student information is provided in StudentInfo.tsv. 
Assume the number of students is at least 1 and at most 20. Assume also the last names and first names do not contain whitespaces.

The program performs the following tasks:

Read the file name of the tsv file from the user.
Open the tsv file and read the student information.
Compute the average exam score of each student.
Assign a letter grade to each student based on the average exam score in the following scale:
A: 90 =< x
B: 80 =< x < 90
C: 70 =< x < 80
D: 60 =< x < 70
F: x < 60
Compute the average of each exam.
Output the last names, first names, exam scores, and letter grades of the students into a text file named report.txt. 
Output one student per row and separate the values with a tab character.
Output the average of each exam, with two digits after the decimal point, at the end of report.txt. 
Hint: Use the precision sub-specifier to format the output.
Ex: If the input of the program is:

StudentInfo.tsv
and the contents of StudentInfo.tsv are:

Barrett    Edan    70  45  59
Bradshaw    Reagan  96  97  88
Charlton    Caius   73  94  80
Mayo    Tyrese  88  61  36
Stern    Brenda  90  86  45
the file report.txt should contain:

Barrett    Edan    70  45  59  F
Bradshaw    Reagan  96  97  88  A
Charlton    Caius   73  94  80  B
Mayo    Tyrese  88  61  36  D
Stern    Brenda  90  86  45  C

Averages: Midterm1 83.40, Midterm2 76.60, Final 61.60 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      /* TODO: Declare any necessary variables here. */
      int students = 0;
      int Midterm1;
      int Midterm2; 
      int finalScore;
      double Midterm1Total = 0; 
      double Midterm2Total = 0;
      double finalScoreTotal = 0;
      double average;
      String letterGrade;
      String fileName; 
      String outputFileName = "report.txt";
      Scanner reader = null;
      PrintWriter writer = null;
      
      
      /* TODO: Read a file name from the user and read the tsv file here. */
      fileName = scnr.nextLine();
      reader = new Scanner(new FileInputStream(fileName));
      writer = new PrintWriter(new FileOutputStream(outputFileName));
      
      while (reader.hasNextLine()) {
         
            String[] details = reader.nextLine().split("\t");
            
            Midterm1 = Integer.parseInt(details[2]);
            
            Midterm2 = Integer.parseInt(details[3]);
            
            finalScore = Integer.parseInt(details[4]);
            
            Midterm1Total += Midterm1;
            
            Midterm2Total += Midterm2;
            
            finalScoreTotal += finalScore;
            
            students += 1;
            
            average = Midterm1 + Midterm2 + finalScore;
            
            average /= 3;
            
            if (average >= 90) { 
               letterGrade = "A";
            }
            
            else if (average >= 80) {
               letterGrade = "B";
            }
            
            else if (average >= 70) {
               letterGrade = "C";
            }
            else if (average >= 60) {
               letterGrade = "D";
            }
            
            else {
               letterGrade = "F";
            }
            
            writer.write(String.format("%s\t%s\t%d\t%d\t%d\t%s\r\n",
                    details[0], details[1], Midterm1, Midterm2, finalScore, letterGrade));
            writer.flush();
      }
      
      
      /* TODO: Compute student grades and exam averages, then output results to a text file here. */
      writer.write(String.format("\r\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n",
               Midterm1Total / students, Midterm2Total / students, finalScoreTotal / students));
      
      writer.flush();         
      
   }
}
