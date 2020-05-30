package Queue;

/*
 * Author: Jiaxiu Li
 * Method:
 * Queue()                                   | default constructor
 * Queue(int capacity)                       | constructor with the size of the queue
 * int getSize()                             | get the size of the queue
 * boolean isEmpty()                         | return true if the queue is empty
 * boolean add(T data)                       | add an element from the rear to the queue, return true if succeed
 * boolean push()                            | remove an element from the front of the queue, return true if succeed
 * void clearQueue()                         | clear all elements in the queue
 * T getHead()                               | return the head of the queue
 * void CapacityExtend(int capacity)         | to extend the length of the queue up to the argument "capacity"
 * void printQueue()                         | print queue
 * */

public class Queue<T> {
	
    private static final int  DEFAULT_SIZE = 10;
    private T Data[];
    private int front,rear;
    private int size;
    
    @SuppressWarnings("unchecked")
	public Queue() {
    	Data = (T[])new Object[DEFAULT_SIZE];
    	front = rear = 0;
    }
    
    @SuppressWarnings("unchecked")
	public Queue(int capacity) {
    	Data = (T[])new Object[capacity];
    	front = rear = 0;
    }

    public int getSize() {
    	return size;
    }
    
    public boolean isEmpty() {
    	return front == rear;
    }
    
    public boolean add(T data) {
    	//see if the queue is full
    	if (this.front==(this.rear+1)%this.Data.length){
    		CapacityExtend(Data.length * 2);
    	}
    	
    	Data[this.rear] = data;
    	this.rear = (this.rear+1) % Data.length;
    	size++;
    	return true;
    }
    
    public boolean push() {
    	Data[this.front] = null;
    	this.front = (this.front + 1) % Data.length;
    	size--;
    	return true;
    }
    
    public void clearQueue() {
    	int i = this.front;
    	while( i != this.rear ) {
    		 Data[i] = null;
    		 i = ( i+1 ) % Data.length;
    	}
     
        this.front=this.rear=0;
        size=0;
    }

    
    public T getHead() {
    	return Data[front];
    }
    
    @SuppressWarnings("unchecked")
	public void CapacityExtend(int capacity) {
        if (capacity<size)
            return;

        T[] old = Data;
        Data= (T[]) new Object[capacity];
        int i = this.front;
        int j=0;
        while( i != this.rear ) {
        	 Data[j++] = old[i];
        	 i = ( i + 1 ) % old.length;
        }
      
        this.front=0;
        this.rear=j;
    }
    
    public void printQueue() {
    	if( this.front == this.rear )
    		System.out.println("null");
    	int i = this.front;
    	while( i != this.rear ) {
    		System.out.print(Data[i]+ " ");
    		i = (i + 1) % Data.length;
    	}
    		
    }

}
