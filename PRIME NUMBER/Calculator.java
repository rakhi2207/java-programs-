import java.util.*;
public class Calculator{
    public static void main(String[] args) {
         Scanner abc = new Scanner(System.in); 
            System.out.println("Enter Value of a: ");
            int a =abc.nextInt();
            System.out.println("Enter Value of b: ");
            int b= abc.nextInt();
            System.out.println("Choose Your Desired Option");
            System.out.println("1. For Addition");
            System.out.println("2. For Subtration");
            System.out.println("3. For Multiplication");
            System.out.println("4. For Division");
            System.out.println("5. For Modulo/Remainder");
            System.out.println("Enter Operation to do");
            int num=abc.nextInt();
            switch (num) {
                case 1 : System.out.println("Result is : "+(a+b));
                break;
                case 2 : System.out.println("Result is : "+(a-b));
                break;
                case 3 : System.out.println("Result is : "+(a*b));
                break;
                case 4 : System.out.println("Result is :"+(a/b));
                break;
                case 5 : System.out.println("Result is :"+(a%b));
                break;
                default:
                    System.out.println("Invalid Choice");
            }
            abc.close();
        }
       
    }