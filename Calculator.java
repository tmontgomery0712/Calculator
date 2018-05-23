package calculator;
import java.util.Scanner;

public class Calculator {
  
  
  public static void main(String[] args)
  {
    
    double num1, num2;
    String user = "";
  
    Scanner input = new Scanner(System.in);
   
   
    System.out.println("Welcome to the Calculator Program");
  
  // loop through until user enters anything other than Y for yes.
  do
  {
    System.out.println("==> Enter first number:");
    num1 = input.nextDouble();
    
    System.out.println("==> Enter second number:");
    num2 = input.nextDouble();
    
  
    int operation;
    
    System.out.println("=> Enter the number based on operation: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division.");
    operation = input.nextInt();
    switch (operation)
    {
    case 1:
      try {
        System.out.println(add(num1, num2));
      } catch (InterruptedException e3) {
        // TODO Auto-generated catch block
        e3.printStackTrace();
      }
      break;
    case 2:
      try {
        System.out.println(subtract(num1, num2));
      } catch (InterruptedException e2) {
        // TODO Auto-generated catch block
        e2.printStackTrace();
      }
      break;
    case 3:
      try {
        System.out.println(multiply(num1, num2));
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
      break;
    case 4:
      try {
        System.out.println(divide(num1, num2));
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      break;
      default:
    }
    
      System.out.println("Would you like to make another calculation? Y or N"); 
      user = input.next().toUpperCase();
       
   } while(user.equals("Y"));
  
     System.out.println("Thanks for using the Calculator Program");
     input.close();
 } 
  
  public static double add(double x, double y) throws InterruptedException
  {
    double answer = x + y;
    System.out.println("Your anwer is...");
    Thread.sleep(1000);
    return answer;
  }
  
  public static double subtract(double x, double y) throws InterruptedException
  {
    double answer = x - y;
    System.out.println("Your anwer is...");
    Thread.sleep(1000);
    return answer;
  }
  
  public static double multiply(double x, double y) throws InterruptedException
  {
    double answer = x * y;
    System.out.println("Your anwer is...");
    Thread.sleep(1000);
    return answer;
  }
  
  public static double divide(double x, double y) throws InterruptedException
  {
    double answer = x / y;
    System.out.println("Your anwer is...");
    Thread.sleep(1000);
    return answer;

  }
}
 

