/******************************************************
 * This is an interface to be implemented by the Circle, 
 * Square, and Rectangle classes. It sets up the constant
 * PI and demands getArea and getPerimeter methods.
 * 
 *-Sami
 ******************************************************/

package chapter2Pkg;

public interface FigureGeometry {
	final float PI = 3.14f;
	
	//getArea method to demand getArea in implementor classes
	float getArea();
		//classes that implement this interface must use getArea
	
	//getPerimeter method to demand getPerimeter in implementor classes
	float getPerimeter();
}		//classes that implement this interface must use getArea
