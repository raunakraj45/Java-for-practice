/*
 * Program: WAP in java to draw a pattern?
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * @Name: Raunak Raj
 * @Date: 28/10/2022
 * */


package com.pattern;

//Declaration of class
public class Pattern1 {

	//Main Method
	public static void main(String[] args) {
		
		//Declaring of variables
		int i,j;
		
		//Outer Loop
		for(i=1;i<=5;i++)
		{
			
			//Inner Loop
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
				
			}//Inner Loop Ends
			
			System.out.println();//For break a line
		}//Outer Loop Ends

	}//End of Main

}//End of Class
