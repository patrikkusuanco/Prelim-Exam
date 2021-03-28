import java.util.Scanner;

class Student {
   public String ID;
   public int numberOfCredits;
   public int points;
   public double gradePoint;

   public Student() {
   }

   public Student(String aID, int aNumberOfCredits, int aPoints) {
       super();
       ID = aID;
       numberOfCredits = aNumberOfCredits;
       points = aPoints;
       calculateGradePoint();
   }

   public String getID() {
       return ID;
   }

   public void setID(String aID) {
       ID = aID;
   }

   public int getNumberOfCredits() {
       return numberOfCredits;
   }

   public void setNumberOfCredits(int aNumberOfCredits) {
       numberOfCredits = aNumberOfCredits;
   }

   public int getPoints() {
       return points;
   }

   public void setPoints(int aPoints) {
       points = aPoints;
   }

   @Override
   public String toString() {
       return "ID : " + ID + " NumberOfCredits : " + numberOfCredits + " Points : " + points + " Grade Point : "
               + gradePoint;
   }

   public void calculateGradePoint() {
       gradePoint = points / (double) numberOfCredits;
   }
}
