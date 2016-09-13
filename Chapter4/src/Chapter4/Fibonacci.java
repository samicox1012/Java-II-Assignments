/*************************************************
 * Samantha Cox
 * CISP2180R50 Java Programming II
 * George Meghabghab
 * 11/16/15
 * ***********************************************
 * Chapter 4 Assignment 1
 * This program demonstrates use of recursion as well
 * as an applet and gui  to allow the user to find the 
 * Fibonacci calculation for a num. Stalls around 40 
 *  
 * ***********************************************
 * This creates a recursive function that will return
 * 1 for any value <= 1 and calculates the Fibonacci
 * result for all others
 * 
 * -Sami
 *************************************************/
package Chapter4;

public class Fibonacci {
	
/* Method recursively adds the value of theNum - 1 to
theNum - 2 for each iteration until original number is reached*/
public static long fib (int theNum)
{
	//disallows negative numbers
	if (theNum<=1)
		return 1;
	
	else
		return fib(theNum-2) + fib(theNum-1);
}


}
