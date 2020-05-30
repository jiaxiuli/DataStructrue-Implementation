package Queue;

public class MyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize a queue
		Queue<Integer> que = new Queue<Integer>();
		for( int i = 0 ; i < 10 ; i++ ) {
			que.add(i);
		}
		
		System.out.println("the original queue is :");
		que.printQueue();
		
		//remove two elements
		System.out.println();
		System.out.println();
		System.out.println("remove two elements from the front of the queue: ");
		que.push();
		que.push();
		que.printQueue();
		
		//add elements to the queue
		System.out.println();
		System.out.println();
		System.out.println("add 100, 200, 300 to the rear of the queue: ");
		que.add(100);
		que.add(200);
		que.add(300);
		que.printQueue();
		
		//clear queue
		System.out.println();
		System.out.println();
		System.out.println("clear the queue and print the queue: ");
		que.clearQueue();
		que.printQueue();
		
		//add another two elements to the empty queue
		System.out.println();
		System.out.println("add another two elements to the empty queue, and get the size of the queue: ");
		que.add(12);
		que.add(13);
		System.out.println(que.getSize());
		
		System.out.println();
		System.out.println("get head: ");
		System.out.println(que.getHead());
		
	}

}
