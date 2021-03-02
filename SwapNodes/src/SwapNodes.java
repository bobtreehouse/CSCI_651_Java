

public class SwapNodes {
	
	//singly linked; swap the node-links & not the data 

	 class Node {
		 

		     int data;
			 Node next; 

		     // Constructor 
		     Node(int d) 
		     { 
		         data = d; 
		         next = null; 
		     } 
 


 

	public static void swapNodes (Node beforeA) {
		
		Node a, b; 
	
		a = beforeA.next;
		afterp = p.next; 
		
		p.next = afterp.next;
		beforep.next = afterp;
		afterp.next = p;
	
		
	}
	
	
	public static void swapNodesDoubly (Node a, Node bhead) {
		
		Node listA = new Node(0);
		listA.next = head;
		
		Node p; 
		Node afterp;
		
		// both a, b pointers are not null; likely inner nodes
		p = beforep.next;
		afterp = p.next; 
		
		p.next = afterp.next;
		beforep.next = afterp;
		afterp.next = p;
	
		
	}
	
	public static  int countNodes(Node head) {
		//assuming that head != null
		
		int count = 1;
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
			count += 1;
		}
		return count;
	}
	 

}
