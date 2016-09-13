/*****************************************************
 * Samantha Cox
 * CISP2180R50 Java Programming II
 * George Meghabghab
 * 12/1/15
 * ***************************************************
 * Chapter 6 Assignment 1
 * This program demonstrates use of the List ADT. This is 
 * done by having the computer generate 20 random numbers, 
 * entering them into the list, and testing the equivalence 
 * of each one singularly against the contents of the list,
 * to determine how many of each number it generated.
 * ***************************************************
 * This class tests the RefList and LLObjectNode classes.
 * It access the methods in those classes to test how many
 * of each number exist in a group of randomly generated numbers,
 * are created each time the program is run.
 * 
 * -Sami
 *****************************************************/
import java.math.*;
public class PEX6 
{
	private static int CountValue(ListInterface<Integer> theList,int theValue)
	{
		theList.reset();
		int nFound = 0;

		//iterate through each element, comparing it to theValue
		for (int i = 0; i < 20; i++)
		{
			if  (theList.getNext().equals(theValue)) 
			{
				nFound++;
			}
		}
	return nFound;
	}
	
public static void main (String[] theArgs)
	{
		ListInterface<Integer> theList = new RefList<Integer>();
			for (int i = 0; i < 20; i++)
				{
					int Random = ((int)(Math.random()*5));
					theList.add(new Integer(Random));
				}
					theList.writeLinkedList();
					theList.toString();
				
				
			for (int i = 0; i <5; i++)
			{
				int vCount = CountValue(theList, i);
				System.out.println("Occurrences of " + i +": " + vCount);
				
			}
			
			

	}

}
