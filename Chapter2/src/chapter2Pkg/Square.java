/*****************************************
 * This class implements FigureGeometry interface
 * to calculate the area and perimeter of a 
 * square using a point stored in Point class.
 * 
 * -Sami
 *****************************************/

package chapter2Pkg;

public class Square implements FigureGeometry{
	//variable for point from point class
	private Point point;
	
	//constructor
	public Square(Point p){
		point = p;
	}
	//getSideLegnth method to get width from point class
	public int getSideLength(){
		return point.getWidth();
	}
	//getArea/Perimeter methods to calculate area and perimeter
	public float getArea(){
		return getSideLength() * getSideLength();
	}
	public float getPerimeter(){
		return getSideLength() * 4;
	}
	//setPoint method to assign side length of square
	public void setPoint(Point p){
		point = p;
	}
}
