// Prime Number code in java //

package loops;

import java.util.Scanner;

public class PimeNumbers {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		boolean isprime=true;
				for (int i=2;i*i<=n;i++) {
					if(n%i==0) {
						isprime=false;
						break;
					}
				}
				if(n<2)
					isprime=false;
		
		System.out.println(" isprime?"+isprime);
			

	}

}
