/***********************************************************
 * This class implements the ListInterface. It 
 * completes 9 predefined methods: size, contains, remove, 
 * get, toString, writeLinkedList, reset, getNext, and add, 
 * all defined below.
 * As well as 5 methods to manipulate the LLObjectNode class.
 * The LLObjectNode class, defined here, allows
 * manipulation of node/link information. 
 * 
 *  -Sami
************************************************************/

class LLObjectNode<T>
{
	private LLObjectNode<T> link;
	//reference to next node
		
	private T info;
	//reference to data to be stored by node

	public LLObjectNode (T theInfo)
	//instantiates variables with incoming info
	{
		info = theInfo;
		link = null;
	}
		
	public void setInfo (T theInfo)
	//assigns incoming info to node
	{
		info = theInfo;
	}
	
	public T getInfo()
	//returns data stored in the node
	{
		return info;
	}
		
	public void setLink(LLObjectNode<T> theLink)
	//assigns new node to follow current node
	{
		link = theLink;					
	}
	
	 public LLObjectNode<T> getLink ()
	 //return node following current node
	 {
		 return link;
	 }
}

public class RefList<T> implements ListInterface<T>
{
	protected int numElements;	//stores elements in list
	protected LLObjectNode<T> first; //points to first node in list, null when empty
	protected LLObjectNode <T> currentPos; //used for iteration through lists
		//variable set to null if asked for reset, then will point to first element
	protected boolean found; //locates elements on list. returns true if successful
	protected LLObjectNode<T> location; //points to found element
	protected LLObjectNode<T> previous; //point to element preceding found one
	
	protected void find (T theTarget)
	/*-finds elements in list that are copies of given object.
	 *-if successful "found" is set to true, "location" points to 
	 *found element, and the previous variable will point to the element
	 *preceding the found element, unless the found element is first.
	 */
	{
		found = false;
		location = first;
		previous = null;
		
		while(location != null)
		{
			if (location.getInfo().equals(theTarget))
			{
				found = true;
				break;
			}
			else
			{
				previous = location;
				location = location.getLink();
			}
		}
	}
	
	public RefList()
	//create empty list
	{
		currentPos = null;
		first = null;
		numElements = 0;
	}
	
	public int size()
	//returns num of elements in the list
	{
		return numElements;
	}
	
	public boolean contains (T theTarget)
	//returns true if this contains a copy of given object
		//comparisons should be called with equals method
	{
		find(theTarget);
		return found;
	}
	
	public boolean remove (T theTarget)
	//removes first element in the list that is a copy of the given object
	//Return true if such element is found
	{
		find (theTarget);
		if(found)
		{
			if (location == first)
				first = first.getLink();
			else
				previous.setLink(location.getLink());
			--numElements;
		}
		return found;
	}
	
	public T get (T theTarget)
	//returns reference to the first element in this list that exists as 
		//a copy of the given object, returns null otherwise
	{
		find (theTarget);
		if(found)
			return location.getInfo();
		else 
			return null;
	}
	
	public String toString ()
	//returns formatted string representation of the list
	{
		LLObjectNode node = first;
		StringBuffer buff = new StringBuffer ("List:");
		while (node != null)
		{
			buff.append(" " + node.getInfo());
			node = node.getLink();			
		}
		return buff.toString();
	}
	
	public void writeLinkedList ()
	//print contents of list
	{
		System.out.println(toString());
	}
	
	
	public void reset()
	//initialize list for iteration
	{
		currentPos = first;
	}
	
	public T getNext()
	//returns reference to element located at iterators's curr position
	// and increments iterator. If iterator points to last element. reset 
	//to first element.
	//-Preconditions:
		//*not empty, *reset, *not modified since reset.
	{
		Object next = currentPos.getInfo();
		if (currentPos.getLink() == null)
			currentPos = first;
		else 
			currentPos = currentPos.getLink();
		return (T) next;	//cast next object as type T to avoid error
	}
	
	public void add (T theObject)
	//inserts given object on front of list
	{
		LLObjectNode<T> node = new LLObjectNode<T>(theObject);
		node.setLink(first);
		first = node;
		++numElements;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
