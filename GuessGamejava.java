import java.util.Scanner;
import java.util.Arrays;
public class GuessGamejava{
    public static void main(String args[]){
        double random=Math.floor(Math.random()*5)+1;
        // System.out.println(random);
        
        Scanner sc=new Scanner(System.in);
       
        while(random>0){
            System.out.println("ENTER YOUR GUESS");
            double guess=sc.nextInt();
            if(guess>random){
                System.out.println("TOO HIGH");
                
        }
        else if(guess<random) {
            System.out.println("TOO LOW");
            
    }
    else{
        System.out.println("YOU GOT IT");
        break;
    }
  
}


    
}
}