package Queue;

public class MyLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize a Linked queue
		LinkedQueue<Integer> L_que = new LinkedQueue<Integer>();
		for( int i = 0 ; i < 10 ; i++ )
			L_que.add(i);
		System.out.println("the original queue is :");
		L_que.printLinkedQueue();
	    
		//remove elements
		System.out.println();
		System.out.println("remove two elements from the front of the queue: ");
		L_que.push();
		L_que.push();
		L_que.printLinkedQueue();
		
		//add elements
		System.out.println();
		System.out.println("add 100 and -200 to the rear of the queue: ");
		L_que.add(100);
		L_que.add(-200);
		L_que.printLinkedQueue();
		
		//get size
		System.out.println();
		System.out.println("get the size of the queue:");
		System.out.println(L_que.getSize());
		
		//clear and see if the queue is empty
		System.out.println();
		System.out.println("clear the queue and then see if the queue is empty: ");
		L_que.clearQueue();
		System.out.println(L_que.isEmpty());
		
		//add and get head
		System.out.println();
		System.out.println("add 15 to the empty queue and get the head: ");
		L_que.add(15);
		System.out.println(L_que.getHead());
		
	}

}
