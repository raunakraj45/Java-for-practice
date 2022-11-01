/*
 * Program: WAP in java to draw a pattern?
 *       *
 *      **
 *     ***
 *    ****
 *   *****
 *  ******
 * @Name: Raunak Raj
 * @Date: 28/10/2022
 * */

package com.pattern;

//Create a class
public class pattern3 {
	
	//Method Calls
	static void drawPattern()
	{
		//Declaring Variables
		int i,j;
		
		//Outer For Loop
		for(i=1;i<=6;i++)
		{
			//First Inner For Loop
			for(j=6;j>i;j--)
			{
				System.out.print(" ");
			}//End of First Inner For Loop
			
			//Second Inner For Loop
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}//End of Second Inner For Loop
			
			System.out.println();//For line break
		}//End of Outer For Loop
	}//End of Method

	//Maim Method Starts
	public static void main(String[] args) {

		//Method Calling
		drawPattern();

	}

}
