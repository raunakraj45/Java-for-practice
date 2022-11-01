/*
 * Program: WAP in java to check a no. is palindrome or not using while loop?
 * @Name: Raunak Raj
 * @Date: 01/11/2022
 * */

package Palindrome;

//Import Scanner
import java.util.Scanner;

//Create Class
public class PalindromeWhile
{
	//Method calling
	static void checkPalindrome(int number)
	{
		//Declaring variables
		int remainder=0,reversedNumber=0;
		int temp=number; //temporary variable to store number 
		
		//While loop for reversing a no.
		while(number>0)
		{
			remainder=number%10;
			reversedNumber=(reversedNumber*10)+remainder;
			number=number/10;
		}
		
		//Comparing Orignal Number to Reversed Number
		if(reversedNumber==temp)
			System.out.println("Palindrome No.: "+reversedNumber);
		else
			System.out.println("Not Palindrome No.: "+reversedNumber);
	}//End of method

	//Main Method
	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner sc = new Scanner(System.in);

		//Declaring Variable
		int orignalNumber;
		System.out.println("Enter a no. to check: ");
		orignalNumber=sc.nextInt();
		
		//Method Calls
		checkPalindrome(orignalNumber);
		
		sc.close();

	}//End of Main

}//End of Class
