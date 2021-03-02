import java.util.HashMap;

//Java program to implement 
//a Singly Linked List 
public class LinkedList2 { 

 Node head; // head of list 

 // Linked list Node. 
 // This inner class is made static 
 // so that main() can access it 
 static class Node { 

     int data; 
     Node next; 
     Node prev;

     // Constructor 
     Node(int d) 
     { 
         data = d; 
         next = null; 
     } 
 } 

	public static void swapNodes (Node beforeA) {
		
		Node a, b; 
	
		a = beforeA.next;
		b = a.next; 
		
		a.next = b.next;
		beforeA.next = b;
		b.next = a;
		
	}
	
	public static void swapNodesDoubly (Node c) {
		
		Node a, b; 
	
		a = c.prev;
		b = c.next; 
		
		c.next = a.next;
		a.next = b;
		b.next = c;
		c.next.prev = c;
		c.prev = a;
		b.prev = a;
		
	}
	
	// get intersection of 2 linked lists 
	public static void getIntersect(Node h1, Node h2) {
		Node result = null;
		Node r1 = h1;
		
		//traverse 1st list and look for each element in list2
		// if present, insert into the result; 
		while(r1 != null) {
			if(contains(h2, r1.data))
				push(r1.data);
			r1 = r1.next;
		}
	}
	
	
 private static void push(int data) {
		// TODO Auto-generated method stub
	 
		
	}

private static boolean contains(Node h2, int data) {
		// TODO Auto-generated method stub
    Node t = h2;
    while (t != null) {
        if (t.data == data)
            return true;
        t = t.next;
    }
    return false;
	}


LinkedList2 getUnion(Node head1, Node head2)
{
    // HashMap that will store the
    // elements of the lists with their counts
    HashMap<Integer, Integer> hmap = new HashMap<>();
    Node n1 = head1;
    Node n2 = head2;
    LinkedList2 result = new LinkedList2();

    // loop inserts the elements and the count of
    // that element of list1 into the hmap
    while (n1 != null) {
        if (hmap.containsKey(n1.data)) {
            int val = hmap.get(n1.data);
            hmap.put(n1.data, val + 1);
        }
        else {
            hmap.put(n1.data, 1);
        }
        n1 = n1.next;
    }

// Method to insert a new node 
 public static LinkedList2 insert(LinkedList2 list, int data) 
 { 
     // Create a new node with given data 
     Node new_node = new Node(data); 
     new_node.next = null; 

     // If the Linked List is empty, 
     // then make the new node as head 
     if (list.head == null) { 
         list.head = new_node; 
     } 
     else { 
         // Else traverse till the last node 
         // and insert the new_node there 
         Node last = list.head; 
         while (last.next != null) { 
             last = last.next; 
         } 

         // Insert the new_node at last node 
         last.next = new_node; 
     } 

     // Return the list by head 
     return list; 
 } 

 // Method to print the LinkedList. 
 public static void printList(LinkedList2 list) 
 { 
     Node currNode = list.head; 
 
     System.out.print("LinkedList: "); 
 
     // Traverse through the LinkedList 
     while (currNode != null) { 
         // Print the data at current node 
         System.out.print(currNode.data + " "); 
 
         // Go to next node 
         currNode = currNode.next; 
     } 
 } 
 
 // Driver code 
 public static void main(String[] args) 
 { 
     /* Start with the empty list. */
     LinkedList2 list = new LinkedList2(); 

     // 
     // ******INSERTION****** 
     // 

     // Insert the values 
     list = insert(list, 1); 
     list = insert(list, 2); 
     list = insert(list, 3); 
     list = insert(list, 4); 
     list = insert(list, 5); 
     list = insert(list, 6); 
     list = insert(list, 7); 
     list = insert(list, 8); 

     // Print the LinkedList 
     printList(list); 
 } 
}
		
	



