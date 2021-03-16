import java.util.Scanner;

class Student {
   private String ID;
   private int numberOfCredits;
   private int points;
   private double gradePoint;

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

public class ShowStudent2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Id");
       String Id = sc.next();
       System.out.println("Enter number of credits: ");
       int cs = sc.nextInt();
       System.out.println("Enter number of points: ");
       int p = sc.nextInt();
       Student s = new Student(Id, cs, p);
       System.out.println(s);
   }
}
