package LinkedList;
/*
Author: Jiaxiu Li
Methods:
ListNode()                                                          | default constructor.
ListNode(int val)                                                   | constructor with the value of the node.
ListNode(int val,  ListNode last)                                   | constructor with the value and the last node of the node.
ListNode nodeInsert( ListNode head, int index, ListNode insertNode) | Insert a new node to the list at a specific position.
void preOrderPrint(ListNode head)                                   | print the list from the first element to the last element.
void postOrderPrint(ListNode head)                                  | print the list from the last element to the first one.
ListNode nodeRemove(ListNode head, int index)                       | remove the element at the specific position.
ListNode setList(ListNode head, int index, ListNode newNode)        | change the value of the element at the specific position.
ListNode getNode(ListNode head, int index)                          | get the value of the element at the specific position.
int getListSize(ListNode head)                                      | get the length of the list.
ListNode getSubList(ListNode head, int index)                       | get the sublist from a specific position to the end.
ListNode getSubList(ListNode head, int from, int to)                | get the sublist from a specific position to another specific position.
*/
public class ListNode<T> {
	T val;
	ListNode<T> next;
	ListNode<T> last;
	
	public ListNode() {}
	public ListNode(T val) { this.val = val ;}
	public ListNode(T val,  ListNode<T> last) {
		this.val = val;
	//	this.next = next;
		this.last = last;
	}
	
	public ListNode<T> nodeInsert( ListNode<T> head, int index, ListNode<T> insertNode) {
		ListNode<T> node = head;
		if(index == 0) {
			insertNode.next = head;
			head.last = insertNode;
			node = insertNode;
		}else {
		for( int i = 1 ; i < index ; i++ ) {
			head = head.next;
		}
		head.next.last = insertNode;
		insertNode.last = head;
		insertNode.next = head.next;
		head.next = insertNode;
		}
		return node;
	}

	public void preOrderPrint(ListNode<T> head) {
		while( head != null ) {
			System.out.print(" "+head.val);
			head = head.next;
		}
	}
	
	public void postOrderPrint(ListNode<T> head) {
		while( head.next != null ) {
			head = head.next;
		}
		while( head != null ) {
			System.out.print(" "+head.val);
			head = head.last;
		}
	}

	public ListNode<T> nodeRemove(ListNode<T> head, int index) {
		ListNode<T> node = head;
		for( int i = 1 ; i <= index ; i++ ) {
			head = head.next;
		}
		head.last.next = head.next;
		head.next.last = head.last;
		
		
		return node;
	}

	public ListNode<T> setList(ListNode<T> head, int index, ListNode<T> newNode) {
		ListNode<T> node = head;
		for( int i = 1 ; i <= index ; i++ ) {
			head = head.next;
		}
		head.last.next = newNode;
		head.next.last = newNode;
		newNode.next = head.next;
		newNode.last = head.last;
		return node;
	}

	public ListNode<T> getNode(ListNode<T> head, int index) {
		ListNode<T> node = head;
		for( int i = 1 ; i <= index ; i++ ) {
			head = head.next;
		}
		node = head;
		return node;
	}

	public int getListSize(ListNode<T> head) {
		int count = 0;
		while( head != null ) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public ListNode<T> getSubList(ListNode<T> head, int index) {
		return getSubList(head, index, getListSize(head) - 1);
	}
	
	public ListNode<T> getSubList(ListNode<T> head, int from, int to) {
		for( int i = 1 ; i <= from ; i++ ) {
			head = head.next;
		}
		ListNode<T> sublist = new ListNode<T>(head.val, null);
		ListNode<T> node = sublist;
	    for( int i = 0 ; i < to - from ; i++ ) {
	    	head = head.next;
	    	sublist.next = new ListNode<T>(head.val, sublist);
	    	sublist = sublist.next;
	    }
		
		return node;
	}
}
