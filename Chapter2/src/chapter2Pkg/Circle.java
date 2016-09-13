/*****************************************
 * This class implements FigureGeometry interface
 * to calculate the area and perimeter of a 
 * circle whose radius is passed in.
 * 
 * -Sami
 *****************************************/

package chapter2Pkg;

public class Circle implements FigureGeometry {
	//Radius variable 
	private float radius;
	
	//Constructor
	public Circle (float theRadius){
		radius = theRadius;		
	}
	
	//getRadius method to return radius of the circle
	public float getRadius(){
		return radius;
	}
	
	/*Methods getArea/Perimeter from 
	FigureGeometry to calculate area and perimeter*/
	public float getArea(){
		return getRadius() * getRadius() * PI;
	}
	public float getPerimeter(){
		return getRadius() * 2 * PI;
	}
		
	//setRadius method to assign the radius of Circle
	public void setRadius(float theRadius){
		radius = theRadius;
	}
	
}
