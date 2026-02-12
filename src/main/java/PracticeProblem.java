/**
* File Name: Lesson 1.3 - Strings
* Author: Angie
* Date Created: Feb 12, 2026
* Date Last Modified: Feb 12, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
	
	/*
	 	1. Output the follow 3 shapes: Leave a blank line after each shape

a)

	 * * * * * *
	* * * * * *
	 * * * * * *
	* * * * * *
 	 * * * * * *
	* * * * * *
 
b)

	* * * * *
	*       *
	*       *
	*       *
	* * * * *

c)

	* * * * * *
	 *       *
	  *     *
	   *   *
	    * *
	     *
		 
	*/
	// Weird Rectangle
	System.out.println(" * * * * * *");
	System.out.println("* * * * * *");
	System.out.println(" * * * * * *");
	System.out.println("* * * * * *");
	System.out.println(" * * * * * *");
	System.out.println("* * * * * *\n");

	//Weird Square
	System.out.println("* * * * *");
	System.out.println("*       *\n*       *\n*       *\n* * * * *\n");

	//Weird Triangle
	System.out.println("* * * * * *");
	System.out.println(" *       *");
	System.out.println("  *     *");
	System.out.println("   *   *");
	System.out.println("    * *");
	System.out.println("     *");


	}

	public static void q2() {
		//Write question 2 code here
		/*2. Store the following pattern in a single variable.  Output the variable:

		          '__'
		          (oo)
		  /========//
		 / || XX ||
		*  ||----||
		   VV    VV
		   ''    ''
		*/

		System.out.println("          '__'\n          (oo)\n  /========//\n / || XX ||\n*  ||----||\n   VV    VV\n   ''    ''");
	}

	public static void q3() {
		//Write question 3 code here
		//3. Store the values "Fortnite " and "is awful" in two variable.  Output them on the same line with two print statements.

		String word1;
		String word2;

		word1 = "Fortnite";
		word2 = "is awful";

		System.out.print(word1);
		System.out.print(" " + word2 + "\n");



	}

	public static void q4() {
		//Write question 4 code here
		//4. Store the values "Don't " and "@ me" in two variables.  Concatenate them together and output using one print statement.

		String word3;
		String word4;

		word3 = "Don't";
		word4 = "@ me";

		System.out.println(word3 + " " + word4);
	}


}
