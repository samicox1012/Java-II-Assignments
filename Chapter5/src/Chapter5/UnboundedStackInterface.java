/***************************************************
 * This is an interface to be implemented by LinkedStack.java.
 * It demands 4 methods: isEmpty, push, pop, 
 * and top, all defined below.
 * 
 * -Sami
 ***************************************************/
 package Chapter5;

public interface UnboundedStackInterface<T> {
	
	boolean isEmpty ();
	//returns true if stack is empty

	void push ( T theObject );
	//pushes element into stack
	
	void pop () throws RuntimeException;
	//Throws RTE if stack is empty, otherwise removes top element from stack

	T top () throws RuntimeException;
	//Throws RTE if stack is empty, otherwise returns top element of stack

	
}
