/*
 * @Program: WAP in Java to check a no is prime or not?
 * @Author: Raunak Raj
 * Date: 28/10/2022
 * */

package prime;

//Import Scanner Class
import java.util.Scanner;

//Creating a class
public class prime1 {
	
	//Method Calls
	static void checkPrime(int num)
	{
		//Declaring Variables
		int i,flag=0;
		
		//0 and 1 are not a prime nos.
		if(num==0||num==1)
		{
			System.out.println(num + " is not a prime no.");
		}
		else
		{
			//For loops starts and check the condition of prime nos.
			for(i=2;i<=(num/2);i++)
			{
				if(num%i==0)
				{
					System.out.println(num + " is not a prime no.");
					flag++;
					break;
				}
			}//End of for loop
			if(flag==0)
			{
				System.out.println(num + " is a prime no.");
			}
		}
	}//End of Method

	//Main method starts
	public static void main(String[] args) 
	{
		//Create an object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//Declaring Variables
		int number;
		System.out.println("Enter a no. to check a no. is prime or not:");
		number=sc.nextInt();
		
		//Method Calling
		checkPrime(number);
		
		sc.close();
	}

}
