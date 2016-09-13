/***************************************************
 * This class stores the width and height of a 2D object 
 * as a point.  
 * 
 * -Sami
 ***************************************************/

package chapter2Pkg;

public class Point {
	
	//Declare variables
	private int width, height;
	
	//Constructor - sets up width and height variables
	public Point (int theWidth, int theHeight){
		width = theWidth;
		height = theHeight;		
	}
	//getWidth/Height methods to return values of width and height
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	//setWidth/Height methods to store values to width and height
	public void setWidth( int theWidth){
		width = theWidth;	
	}
	public void setHeight( int theHeight){
		height = theHeight;	
	}
}
