/*****************************************************
 * Samantha Cox
 * CISP2180R50 Java Programming II
 * George Meghabghab
 * 11/29/15
 * ***************************************************
 * Chapter 5 Assignment 1
 * This program demonstrates use of a Linked Stack
 * and Linked Queue to push, top, pop, print, and check
 * for fullness/emptiness of a stack. This is done by 
 * allowing the user to enter a string, the program puts 
 * the string into both a stack and a queue, then removes 
 * each char, comparing them for equivalence. 
 * 
 * ***************************************************
 * This class tests the LinkedStack and LinkedUnbndQueue 
 * classes, allowing user to input data to test the
 * pop, top, and push/enqueue dequeue methods defined in 
 * them. It will let the user know whether the input string
 * is a palindrome or not.
 * 
 * -Sami
 *****************************************************/
package Chapter5;

import java.util.Scanner;

public class PEX5 {

	public static void main(String[] args) {
		//declare variables
		String newInput = null;				//input string 
		String nextTurn = null;				//yes or no (terminate)
		char ch;							//current char processing
		int length;							//length of string
		int numLetters = 0;						//number of letters in string
		int charCount;						//number checked so far
		char fromStack;						//curr char popped from stack
		char fromQueue;						//curr char popped from Queue
		boolean stillPal;					//true as long as string is still palindrome
		
				
		
		//prepare scanner
		Scanner scanner = new Scanner(System.in);
		
		//instantiate classes: LinkedUnbndQueue and LinkedStack
		UnboundedStackInterface<Character> stack = new LinkedStack ();
		UnboundedQueueInterface<Character> queue = new LinkedUnbndQueue();
		
		
		do 
		{
			//get string to be tested from user
			System.out.println("Enter a string to see if it is a palindrome.");
			newInput = scanner.nextLine();
			newInput = newInput.replaceAll("\\s","");	//gets rid of spaces
			length = newInput.length();
			numLetters = 0;
			
			for (int i = 0; i < length; i++)
				//load characters into stack and queue
			{
				ch = newInput.charAt( i );
				if (Character.isLetter(ch));
				{
					numLetters ++;
					ch = Character.toLowerCase(ch);
					stack.push(ch);
					queue.enqueue(ch);
				}				
			}
			stillPal = true;
			charCount = 0;
			
			//test if string is palindrome
			while(charCount < numLetters)
			{
				fromStack = stack.top();
				stack.pop();
				fromQueue = queue.dequeue();
				if (fromStack != fromQueue)
				{
					stillPal = false;
				}
				charCount++;
			}
			//prints whether the input string is a palindrome
			if (stillPal)
				System.out.println(newInput + " is a palindrome.");
			else
				System.out.println(newInput + " is not a palindrome.");
			//allows user to continue or terminate program
			System.out.println("Would you like to evaluate another string (Y/N)");
			nextTurn = scanner.nextLine();
			
		}
		while(nextTurn.equalsIgnoreCase("y"));
		System.exit(0);

				

	}

	
	
	
	
	
	
	
}
