package Queue;
import LinkedList.ListNode;
/*
* Author: Jiaxiu Li
* Method:
* LinkedQueue()                             | default constructor
* int getSize()                             | get the size of the queue
* boolean isEmpty()                         | return true if the queue is empty
* boolean add(T data)                       | add an element from the rear to the queue, return true if succeed
* boolean push()                            | remove an element from the front of the queue, return true if succeed
* void clearQueue()                         | clear all elements in the queue
* T getHead()                               | return the head of the queue
* void printQueue()                         | print queue
* */

@SuppressWarnings("unused")
public class LinkedQueue<T> {
	private T data;
	private ListNode<T> front;
	private ListNode<T> rear;
    private int size;
    
    public LinkedQueue() {
    	this.front = null;
    	this.rear = null;
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
    	return this.front == null && this.rear == null;
    }
    
    public boolean add(T data) {
        ListNode<T> node = new ListNode<T>(data);
        if ( this.front == null ) {
            this.front = node;
            this.rear = node;
        } else {
            this.rear.next = node;
            this.rear = this.rear.next;
        }
        
        size++;
        return true;
    }
    
    public T getHead() {
        return this.isEmpty()? null:this.front.val;
    }
    
    public void push() {
       
        this.front = this.front.next;
        if ( this.front==null )
             this.rear=null;
        size--;
       
    }
    public void clearQueue() {
        this.front = this.rear = null;
        size=0;
    }
    
    public void printLinkedQueue() {
    	ListNode<T> head = new ListNode<T>();
    	head = this.front;
    	
    	while( this.front != null ) {
    		System.out.print(this.front.val + " ");
    		this.front = this.front.next;
    	}
    	this.front = head ;
    	System.out.println();
    }


}
