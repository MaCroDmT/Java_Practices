import java.util.Scanner;
 
public class Calculator
{
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply;
    float devide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    devide = (float) first / second;

    System.out.println("Sum = " + add);
    System.out.println("subtraction= " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
  }
}