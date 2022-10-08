import java.util.Scanner;

class sum_of_numbers {
  public static void main(String[] args) 
  {
    int sum=0;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter a number to find its sum");
    int n= inp.nextInt();
    sum=n*(n+1)/2;//direct way to find sum of n numbers(does not require loop)
   System.out.println(sum);
  }
}
