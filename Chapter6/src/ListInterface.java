/***************************************************
 * This is an interface to be implemented by 
 * RefList.java. It demands 9 methods: 
 * size, contains, remove, get, toString, 
 * writeLinkedList, getNext, and add, all defined below
 * 
 * -Sami
 ***************************************************/
public interface ListInterface<T> 
{
	int size();
	//returns num of elements in the list
	
	boolean contains (T theObject);
	//returns true if this contains a copy of given object
	//comparisons should be called with equals method
	
	boolean remove (T theObject);
	//removes first element in the list that is a copy of the given object
		//Return true if such element is found
	
	Object get (T element);
	//returns reference to the first element in this list that exists as 
	//a copy of the given object, returns null otherwise
	
	String toString ();
	//returns formatted string representation of the list
	
	void writeLinkedList ();
	//print contents of list
	
	void reset();
	//initialize list for iteration
	
	T getNext();
	//returns reference to element located at iterators's curr position
	// and increments iterator. I iterator is point to last element. reset 
	//to first element.
	//-Preconditions:
		//not empty, reset, not modified since reset.
	
	void add (T theObject);
	//inserts given object on front of list
	
	
	
}
