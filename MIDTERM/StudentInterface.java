import java.util.Scanner;
public class StudentInterface{
   public static void main(String[] args){
      Student sOne = new Student();
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter Student's First Name: ");
      sOne.setFirstName(scanner.nextLine());
      
      System.out.print("Enter Student's Middle Name: ");
      sOne.setMiddleName(scanner.nextLine());

      System.out.print("Enter Student's Last Name: ");
      sOne.setLastName(scanner.nextLine());
      
      System.out.print("Enter Student's Suffix: ");
      sOne.setSuffix(scanner.nextLine());
      
      System.out.println("First Name: "+ sOne.getFirstName());
      System.out.println("Middle Name: "+ sOne.getMiddleName());
      System.out.println("Last Name: "+ sOne.getLastName());
      System.out.println("Suffix: "+ sOne.getSuffix());
      
      System.out.println("Full Name: "+ sOne.getfullName());
   }
}