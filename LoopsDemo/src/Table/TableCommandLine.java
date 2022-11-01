/*
 * Program: WAP in java to generate a table through command line?
 * @Name: Raunak Raj
 * @Date: 27/10/2022
 * */

package Table;



//Creating Class
public class TableCommandLine 
{
	
	//Method Calling
	static void genTable(int n)
	{
		int i;//Declaring Variables
		for(i=1;i<=10;i++)
			System.out.println(n+" x "+i+" = "+(i*n));
	}

	//Main Method starts
	public static void main(String[] args) {
		
		
		//Method Calls
		genTable(Integer.parseInt(args[0]));

	}

}
