/*
 * Program: WAP in java to check a no. is palindrome or not?
 * @Name: Raunak Raj
 * @Date: 27/10/2022
 * */

package Palindrome;

//Import Scanner
import java.util.Scanner;

//Create Class
public class PalindromeNumber 
{
	//Method calling
	static void palNum(int n)
	{
		//Declaring variables
		int s=0,i;
		
		//For loop for reversing a no.
		for(i=n;i>0;i=i/10)
		{
			s=s*10+(i%10);//Condition for reverse a no.
		}
		if(s==n)
			System.out.println("Palindrome No.: "+n);
		else
			System.out.println("Not Palindrome No.: "+n);
	}//End of method

	//Main Method
	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner sc = new Scanner(System.in);

		//Declaring Variable
		int num;
		System.out.println("Enter a no. to check: ");
		num=sc.nextInt();
		
		//Method Calls
		palNum(num);

	}//End of Main

}//End of Class
