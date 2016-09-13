/***********************************************************
 * This class implements the StackInterface. It completes 5 
 * methods to manipulate the array 'T': isEmpty, isFull, 
 * push, pop, and top, all defined below.
 * 
 *  -Sami
************************************************************/

package Chapter3;

public class ArrayStack<T> implements StackInterface<T>{
	
	//Variables
	protected static final int DEFCAP = 100; //default capacity of array
	protected T[] array;					 
	protected int topIndex = -1;			 //index of top array element
	
	//Constructors
	public ArrayStack (){
		array = (T[]) new Object[DEFCAP];
	}
	public ArrayStack (int theCapacity){
		array = (T[]) new Object[theCapacity];
	}
	
	//isEmpty returns true if stack is empty and false otherwise
	public boolean isEmpty(){
		if(topIndex == -1)
			return true;
		else 
			return false;
	}
	//isFull returns true if stack is full and false otherwise
	public boolean isFull(){
		if (topIndex == (array.length -1))
			return true;
		else
			return false;
	}
	
	//push throws an exception if stack is full, otherwise adds element to stack
	public void push(T theObject){
		if(!isFull()){
			topIndex++;
			array[topIndex] = theObject;}
		else 
			throw new RuntimeException ("Push attempted on a full stack.");
		
	}
	//pop throws an exception if stack is empty, otherwise removes element from stack
	public void pop (){
		if(!isEmpty()){
			array[topIndex]=null;
			topIndex--;}
		else 
			throw new RuntimeException("Pop attempted on empty stack");		
	}
	//pop throws an exception if stack is empty, otherwise returns element from stack
	public T top(){
		T topOfStack = null;
		if(!isEmpty()){
			topOfStack = array[topIndex];}
		else 
			throw new RuntimeException ("Top attempted on empty stack");
		return topOfStack;
	}
}
