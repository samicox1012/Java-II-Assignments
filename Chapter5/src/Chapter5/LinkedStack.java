/***********************************************************
 * This class implements the UnboundedStackInterface. It 
 * completes 4 predefined methods: isEmpty, push, pop, 
 * and top, all defined below. 
 * As well as 5 methods to manipulate the LLObjectNode class.
 * The LLObjectNode class, defined here, allows
 * manipulation of node/link information. 
 * 
 *  -Sami
************************************************************/
package Chapter5;


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
	
public class LinkedStack<T> implements UnboundedStackInterface<T> 
{	
	protected LLObjectNode<T> top;
	//if stack is empty, will be null, otherwise points to top element of Stack	
	
	public LinkedStack ()
	//create empty stack
	{
		top = null;
	}
	
	public boolean isEmpty() 
	//returns true if stack is empty 
	{	 
		return top == null;
	}
	
	public void push(T theObject) 
	//puts incoming node at top of stack
	{ 
		LLObjectNode<T> newNode = new LLObjectNode<T> (theObject);
		newNode.setLink(top);
		top = newNode;
	}
	
	public void pop() throws RuntimeException 
	//throws RTE if empty, otherwise removes top element 
	{ 
		if (!isEmpty())
			top = top.getLink();
		else 
			throw new RuntimeException ("Pop attempted on an emptystack.");
	}
	
	public T top() throws RuntimeException 
	//Throws RTE if empty, otherwise returns info of top element
	{ 
		if (!isEmpty())
			return top.getInfo();
		else
			throw new RuntimeException ("Top attempted on empty an stack.");
	}
	
	
}
