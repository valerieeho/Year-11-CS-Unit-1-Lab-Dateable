import java.util.Scanner;

public class Dateable {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("What is your age?");
      int age = Integer.parseInt(scanner.nextLine());
      while (age < 0) {
          try {
              age = Integer.parseInt(scanner.nextLine());
          }
          catch (NumberFormatException e) {
              System.out.println("Please enter a valid number!");
          }
      }
      int youngestAge = ( 7 + ( age / 2 ) );
      System.out.println(age + "-year olds should date somebody who is at least " + youngestAge + " years old");


  }
  
}
