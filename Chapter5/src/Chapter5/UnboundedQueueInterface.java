/***************************************************
 * This is an interface to be implemented by 
 * LinkedUnbndQueue.java. It demands 3 methods: 
 * isEmpty, enqueue, dequeue, all defined below
 * 
 * -Sami
 ***************************************************/
package Chapter5;

public interface UnboundedQueueInterface<T> {
	
	
	boolean isEmpty ();
	//returns true if the queue is empty, otherwise returns false


    void enqueue ( T theObject );
    //add element to rear of queue


    T dequeue() throws RuntimeException;
    //Throws RTE if queue is empty, otherwise removes front element 
    //and returns reference to it.
}
