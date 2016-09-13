/***********************************************************
 * This class implements the UnboundedQueueInterface. It 
 * completes 3 predefined methods:isEmpty, enqueue, and dequeue, 
 * all defined below. 
 * As well as 5 methods to manipulate the LLObjectNode class.
 * The LLObjectNode class, defined here, allows
 * manipulation of node/link information. 
 * 
 *  -Sami
************************************************************/
package Chapter5;

class LLObjectNodeQ<T>
{
	private LLObjectNodeQ<T> link;
	//reference to next node
	private T info;
	//reference to data to be stored by node
	
	public LLObjectNodeQ (T theInfo)
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
		
	public void setLink(LLObjectNodeQ<T> theLink)
	//assigns new node to follow current node
	{
		link = theLink;					
	}
	
	 public LLObjectNodeQ<T> getLink ()
	 //return node following current node
	 {
		 return link;
	 }
	
}

public class LinkedUnbndQueue<T> implements UnboundedQueueInterface<T>
{
	protected LLObjectNodeQ<T> front;
	//reference to front node of queue
	protected LLObjectNodeQ<T> rear;
	//reference to last node of queue
	
	public LinkedUnbndQueue ()
	//Constructor instantiates variables for empty queue
	{
		front = null;
		rear = null;
	}
	
	public boolean isEmpty()
	//return true if queue is empty
	{
		return front == null;
	}
	
	public void enqueue (T theObject)
	//adds incoming element to rear of queue
	{
		LLObjectNodeQ<T> newNode = new LLObjectNodeQ<T>(theObject);
		if (rear == null)
			front = newNode;
		else 
			rear.setLink(newNode);
		rear = newNode;
	}
	
	public T dequeue ()
	//throws RTE if queue is empty, otherwise returns and removes front element
	{
		if (isEmpty())
			throw new RuntimeException ("Dequeue attempted on empty queue.");
		else
		{
			T frontData = front.getInfo();
			front = front.getLink();
			if (front == null)
				rear = null;
			return frontData;
		}
	}

	
		
	
	
}

