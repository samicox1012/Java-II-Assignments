/*************************************************
 * Samantha Cox
 * CISP2180R50 Java Programming II
 * George Meghabghab
 * 9/29/15
 * ***********************************************
 * Chapter 2 Assignment 1
 * This program demonstrates use of an interface to 
 * set up constants and demand use of certain methods
 * by the class that implement it.
 * 
 * ***********************************************
 * This class tests circle, square, and rectangle
 * class with predetermined values to confirm that
 * the classes function as intended
 * 
 * -Sami
 *************************************************/

package chapter2Pkg;

public class TestAll {
	
	/*Values to be used:
	 * 	Circle = c1, r=5
	 * 	Point = p1, s1=5
	 * 	Point = p2, w=5, h=7
	 * 	Square = s1 w/ parameter (p1)
	 *  rectangle = r1 w/ parameter (p2)
	 */

	public static void main(String[] args) {
		//Instantiate class objects
		Circle c1 = new Circle (5);
		Point p1 = new Point (5, 0); //Zero used for square height(will not be accessed)
		Point p2 = new Point (5, 7);
		Square s1 = new Square (p1);
		Rectangle r1 = new Rectangle (p2);
		
		//print Circle
		System.out.println("Details of c1");
		System.out.println("radius: " + c1.getRadius());
		System.out.println("area: " + c1.getArea());
		System.out.println("perimeter: " + c1.getPerimeter());
		System.out.println();
		
		//print Square
		System.out.println("Details of s1");
		System.out.println("side length: " + s1.getSideLength());
		System.out.println("area: " + s1.getArea());
		System.out.println("perimeter: " + s1.getPerimeter());
		System.out.println();
		
		//print Rectangle
		System.out.println("Details of r1");
		System.out.println("width: " + r1.getWidth());
		System.out.println("height: " + r1.getHeight());
		System.out.println("area: " + r1.getArea());
		System.out.println("perimeter: " + r1.getPerimeter());
		System.out.println();
		

	}

}
