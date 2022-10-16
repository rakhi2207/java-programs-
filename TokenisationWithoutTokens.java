// Program - Given a string,s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
//           We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

import java.io.*;
import java.util.*;
public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();                       //had to trim because of leading and trailing spaces as it will have array made of spaces delimeter
        scan.close();
        if (s.length() > 0) {
            String strarr[] = s.split("[ !,?._'@]+");   //making an array strarr with strings stored in s with predefined delimetres                       
            System.out.println(strarr.length);

            for (int i = 0; i < strarr.length; i++) {
            System.out.println(strarr[i]);        // printing elements of strarr array 
            }
        }
        else {
            System.out.println("0");            
        }
    }
}
