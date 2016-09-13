/*****************************************************
 * Samantha Cox
 * CISP2180R50 Java Programming II
 * George Meghabghab
 * 9/29/15
 * ***************************************************
 * Chapter 3 Assignment 1
 * This program demonstrates use of an Array Stack
 * to push, top, pop, print, and check for 
 * fullness/emptiness of a stack.
 * 
 * ***************************************************
 * This class tests the ArrayStack and StackInterface 
 * classes, allowing user to input data to test the
 * pop, top, and push methods defined in them
 * 
 * -Sami
 *****************************************************/
package Chapter3;

import java.util.Scanner;

public class PEX3 {

	public static void main(String[] args) {
		
		//prepare scanner
		Scanner scanner = new Scanner(System.in);
		
		//instantiated class objects for even and odd stacks
		StackInterface<Integer> evenStack;
		evenStack= new ArrayStack<Integer>();
		
		StackInterface<Integer> oddStack;
		oddStack= new ArrayStack<Integer>();
		
		
		//heading
		System.out.print("Run: \n\n");
		System.out.print("Enter 20 integers: \n\n");
		
		//int to store incoming ints.
		int store;
		
		//stores each input num into appropriate stack
		for (int i = 0; i<20; i++){
			store =scanner.nextInt();
			if ((store %2) == 0){
				evenStack.push(store);}
			else 
				oddStack.push(store);
		}
		
		//prints contents of even stack
		System.out.print("\nEven integers in reverse order: \n\n" );
		while(!evenStack.isEmpty()){
			System.out.print(evenStack.top() + " ");
			evenStack.pop();
		}
		
		System.out.println();
		
		//prints contents of odd stack
		System.out.print("\nOdd integers in reverse order: \n\n" );
		while(!oddStack.isEmpty()){
			System.out.print(oddStack.top() + " ");
			oddStack.pop();
		}
		
		System.out.println();
	}
	

}
