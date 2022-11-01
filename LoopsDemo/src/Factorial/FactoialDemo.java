/*
 * Program: WAP in java to find the factorial of a given no.?
 * @Name: Raunak Raj
 * @Date: 28/10/2022
 * */


package Factorial;

//Import Scanner Class
import java.util.Scanner;

//Create Class
public class FactoialDemo {
	
	//Method Calling
	static void factorial(int number)
	{
		int fact=1;
		for(int i=2;i<=number;i++)
			fact=fact*i;//Condition to find Factorial
		System.out.println("The Factorial of "+number+" is "+fact);
	}

	//Main Method
	public static void main(String[] args) {
		
		//Scanner Class Object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. to find factorial:");
		int num=sc.nextInt();
		factorial(num);
		
		sc.close();

	}//End of main

}//End of class
