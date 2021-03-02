
public class LinkedListSample {

	//use Node Class to hold the integer(or any type) data & Node_next (pointer)
	//linkedList class to implement the list
	// main class to drive example & print 
	
	//first Node is head node; 
	
	Node head;
	
	public void insert( int data) 	{
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null)  {
			
			head = node;
			
		} else {
			
			Node n = head;
			while(n.next != null) {
	
				n = n.next;
			}
			
			n.next = node; //where you are when no more pointers
			
			}
		}
	
	void nthToLast( int data) {
		
		int length = 0;
		Node temp = head;
		
		while(temp != null) {
			temp = temp.next;
			length++;
		}
		
		if(length < data)
			return;
		
		temp = head;
		
		for(int i = 0; i < length - data; i++)
			temp = temp.next;
		
		System.out.println(temp.data);
		
	}
	
	/*
	 * 2.3 Implement an algorithm to delete a node in the middle of a 
	 * singly linked list, given only access to that node.
	 * */
	
	
	//delete middle node; a-b-c-d returns a-b-d
	//move pointer from b->c to b->d
	//don't have access to previous node so have to use next node
	
	void deleteMiddleNode(Node node){
		node.data = node.next.data;
		node.next = node.next.next;
		
		}
		
		
		
		public void show() {
			
			Node node = head; 
			
			while(node.next != null){
				System.out.println(node.data);
				node = node.next;
			}
			
			System.out.println(node.data); // just print the last element which is outside for loop above
		}
	

		/* this is also the answer accepted and teacher example for question 2.3*/
		
public static boolean deleteNode(Node n) {
	if(n == null || n.next == null ) {
		return false; //Failure
	}
	
	Node next = n.next;
	n.data = next.data;
	n.next = next.next;
	return true;
}


public static boolean frontOrLastNode(Node n){
	if(n == null || n.next == null ) {
		// if either of the above conditions are true you are sitting on the Front (head node or the last node)
		
}
	return true;
	
}




}




