package LinkedList;

public class LinkedList {
	
	public static void main(String[] args) {
		ListNode<Integer> head = new ListNode<Integer>(0);
		ListNode<Integer> fakehead = head;
	
		for( int i = 0 ; i < 20 ; i++ ) {
			head.next = new ListNode<Integer>(i+1, head);
			head = head.next;
		}
		System.out.println("Original list: ");
		head.preOrderPrint(fakehead);
		System.out.println();
		System.out.println();
		//insert a new node to the list at a specific position
		System.out.println("Insert \"-123\" at position 4: ");
		ListNode<Integer> insertnode = new ListNode<Integer>(-123);
		fakehead = head.nodeInsert(fakehead, 4, insertnode);
		System.out.println("pre-order print: ");
		head.preOrderPrint(fakehead);
		System.out.println();
		System.out.println("post-order print: ");
		head.postOrderPrint(fakehead);
		
		//remove
		System.out.println();
		System.out.println();
		System.out.println("remove the element at position 10: ");
	    head.nodeRemove(fakehead, 10);
	    System.out.println("pre-order print: ");
	    head.preOrderPrint(fakehead);
		System.out.println();
		System.out.println("post-order print: ");
		head.postOrderPrint(fakehead);
		
		//change element in the list
		ListNode<Integer> newnode = new ListNode<Integer>(-20);
		head.setList(fakehead, 10, newnode);
	    System.out.println();
		System.out.println();
		System.out.println("change the element at position 10 to -20: ");
		System.out.println("pre-order print: ");
		head.preOrderPrint(fakehead);
		System.out.println();
		System.out.println("post-order print: ");
		head.postOrderPrint(fakehead);
		
		//get the element by index
		System.out.println();
		System.out.println();
		System.out.println("get the node at index of 10: ");
		ListNode<Integer> getnode = head.getNode(fakehead, 10);
		System.out.println(getnode.val);
		
		
		//get the size of the List
		System.out.println();
		System.out.println();
		System.out.println("get the size of the List: ");
		int size = head.getListSize(fakehead);
		System.out.println(size);
		
		//get sublist
		System.out.println();
		System.out.println();
		System.out.println("get subList by \"from\" and \"to\": ");
		ListNode<Integer> sublist1 = head.getSubList(fakehead, 6, 18);
		System.out.println("pre-order: ");
		head.preOrderPrint(sublist1);
		System.out.println();
		//post-order
		System.out.println("post-order: ");
		head.postOrderPrint(sublist1);
		System.out.println();
		System.out.println();
		System.out.println("get subList by a specific position to the end: ");
		sublist1 = head.getSubList(fakehead, 16);
		//pre-order
		System.out.println("pre-order: ");
		head.preOrderPrint(sublist1);
		System.out.println();
		//post-order
		System.out.println("post-order: ");
		head.postOrderPrint(sublist1);
		
	    //≈≈–Ú
		int arr[] = new int[] {5,6,2,6,6,1,3,5,10,34,52,23,14,5,4,25,5,25,56,46,36,26,75,47,37,67,57,47,34,
				65,46,36543,76,567,45,676,4356,76,4467,7,65};
		
		ListNode<Integer> list = new ListNode<Integer>(arr[0] , null);
		ListNode<Integer> list0 = list;
		for( int i = 1 ; i < arr.length ; i++ ) {
			int j = 0;
			ListNode<Integer> node = new ListNode<Integer>(arr[i]);
			ListNode<Integer> last = new ListNode<Integer>();
			list = list0;
			while(  list != null && list.val < arr[i] ) {
				last = list;
				list = list.next;
				j++;
			}
			if( list == null ) {
				list = new ListNode<Integer>(arr[i]);
				last.next = list;
			}
			else
				list0 = list.nodeInsert(list0, j, node);
		}
		System.out.println();
		System.out.println("the result of sort: ");
		list0.preOrderPrint(list0);
	}

}
