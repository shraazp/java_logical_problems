//Java program to get a Fibonacci Series
package logical;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();   //@input number 
		int i=1,first_term=0,second_term=1,next_term=0;
		System.out.println("The fibonacci series for "+n+" is");
		while(i<=n)
		{
			System.out.print(first_term+" ");
			next_term=first_term+second_term;  //@parameter counter to store the sum
			first_term=second_term;				//@parameter previous value
			second_term=next_term;				//@parameter next value
			i++;
		}
		sc.close();
	}

}
