package address;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Coupon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //scanner class
		Random random = new Random();	//to get random class
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		ArrayList<Integer> distinct=new ArrayList<>(); //to store the distinct coupon numbers
		int number,c=0,random_number=0;
		while(c!=n) //iterate till all numbers obtained
		{
			number=random.nextInt(10);
			random_number++;
			int index=distinct.indexOf(number); //check if number is already present
			if(index==-1)
	    	{
	    		distinct.add(number); //add distinct number to the list
	    		c++;
	    	}
		}
		System.out.println("Number of random numbers is "+random_number);
		System.out.println(distinct);
	}

}
