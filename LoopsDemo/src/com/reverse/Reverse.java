/*
 * Program: WAP in java to reverse a no.?
 * @Name: Raunak Raj
 * @Date: 27/10/2022
 * */

package com.reverse;

//Import Scanner
import java.util.Scanner;

//Create Class
public class Reverse 
{
	//Method calling
	static void revNum(int n)
	{
		//Declaring variables
		int s=0,i;
		
		//For loop for reversing a no.
		for(i=n;i>0;i=i/10)
		{
			s=s*10+(i%10);//Condition for reverse a no.
		}
		System.out.println("Reversed No.: "+s);
	}//End of method

	//Main Method
	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner sc = new Scanner(System.in);

		//Declaring Variable
		int num;
		System.out.println("Enter a no. to reverse a no.: ");
		num=sc.nextInt();
		
		//Method Calls
		revNum(num);

	}//End of Main

}//End of Class
