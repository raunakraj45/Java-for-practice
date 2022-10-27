/*
 * Program: WAP in java to generate a table?
 * @Name: Raunak Raj
 * @Date: 27/10/2022
 * */

package Table;

//Import Scanner Class
import java.util.Scanner;

//Creating Class
public class generateTable {
	
	//Method Calling
	static void genTable(int n)
	{
		int i;//Declaring Variables
		for(i=1;i<=10;i++)
			System.out.println(n+" x "+i+" = "+(i*n));
	}

	//Main Method starts
	public static void main(String[] args) {
		
		//Declaring Variables
		int num;
		
		//Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. to generate a table: ");
		num=sc.nextInt();
		
		//Method Calls
		genTable(num);

	}

}
