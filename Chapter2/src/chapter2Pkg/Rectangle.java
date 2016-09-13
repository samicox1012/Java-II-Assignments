/*****************************************
 * This class implements FigureGeometry interface
 * to calculate the area and perimeter of a 
 * rectangle using a point stored in Point class.
 * 
 * -Sami
 *****************************************/

package chapter2Pkg;

public class Rectangle implements FigureGeometry {
	//variable for point from point class
	private Point point;
		
	//constructor
	public Rectangle(Point p){
		point = p;
	}
	//getWidth method to get width from point class
	public int getWidth(){
		return point.getWidth();
	}
	//getHeight method to get height from point class
	public int getHeight(){
		return point.getHeight();
	}
	//getArea/Perimeter methods to calculate area and perimeter
	public float getArea(){
		return getWidth() * getHeight();
	}
	public float getPerimeter(){
		return ( getWidth() + getHeight() ) * 2;
	}
	//setPoint method to assign point of rectangle
	public void setPoint(Point p){
		point = p;
	}
}
