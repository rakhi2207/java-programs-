import java.util.*;
public class HexaToDecimal
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter the hexadecimal number ");
		  String hex=scn.next();  
      int decimal=Integer.parseInt(hex,16);  
      System.out.println(decimal);  
	}
}
