/***************************************************
 * This is an interface to be implemented by ArrayStack.java.
 * It demands 5 methods: isEmpty, isFull, push, pop, 
 * and top, all defined below
 * 
 * -Sami
 ***************************************************/

package Chapter3;

public interface StackInterface<T> {

	boolean isEmpty();
	//returns true if the stack is empty, otherwise returns false
	
	boolean isFull();
	//returns true if the stack is full, otherwise returns false
	
	void push (T theObject) throws RuntimeException;
	//Throws RTE is stack is full, otherwise pushes element into stack
	
	void pop () throws RuntimeException;
	//Throws RTE if stack is empty, otherwise removes top element from stack
	
	T top() throws RuntimeException;
	//Throws RTE if stack is empty, otherwise returns top element of stack
	
}
