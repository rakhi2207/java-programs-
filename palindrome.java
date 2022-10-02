
import java.io.*;


public class Palindrome{
public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));	

//=========================methods======================
	public static boolean isFiveDigit(String strDigit){
		if(strDigit.length()==5)
			return true;
	return false;
	}//test if the input number is five digit

	public static String stringReverse(String rStr){
		StringBuffer strBuff = new StringBuffer(rStr);
		return strBuff.reverse().toString();
	}//reverse the string

	public static String removeLetter(String str){
		int i,len = str.length();
		StringBuffer sBuf = new StringBuffer(str);
		char c;

			for(i= (len-1);i>=0;--i){
				c = sBuf.charAt(i);
					if(!Character.isDigit(c))
					sBuf.append(c);
			}
		return sBuf.toString();			
	}//remove the letter in the digit

	public static void isPalindrome(String strToTest,String revStr){
		if(revStr.equalsIgnoreCase(strToTest)){
			System.out.println("\n" + revStr + " is a palindrome!...\n");
		}else{
			System.out.println("\n" + revStr+" is not a Palindrome!.\n");
		}
	}//check if the digit is a palindrome

//=======================main=================================
	public static void main(String []args)throws IOException{

		String str,reverseStr;
		int tag;



		do{
			System.out.print("\nEnter a five-digit integers: ");
			str = input.readLine();
			str = removeLetter(str);		
				if(!isFiveDigit(str)){
					System.out.print("\nInput number is not a five-digit integers");
					tag=1;
				}else{
					tag=0;
				}
		}while(tag==1);//loop until user input is correct

		reverseStr = stringReverse(str);
		isPalindrome(str,reverseStr);

	}//end of main

}//end of class 