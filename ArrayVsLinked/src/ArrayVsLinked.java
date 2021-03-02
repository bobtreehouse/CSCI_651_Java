import java.util.*;
import java.util.stream.Collectors;

public class ArrayVsLinked {
	// remember linked lists are not contiguous in memory they use pointers
	
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		for(int i = 0; i < 100000; i++){
			linkedList.add(i);
			arrayList.add(i);
				
		}
		
		final long startTimeLL = System.nanoTime();
		linkedList.get(10000);
		//linkedList.remove(1);
		final long endTimeLL = System.nanoTime();
		
		final long startTimeAL = System.nanoTime();
		arrayList.get(10000);
		//arrayList.remove(1);
		final long endTimeAL = System.nanoTime();
		 	
		
		long totalTimeLL = endTimeLL - startTimeLL;
		long totalTimeAL = endTimeAL - startTimeAL;
		
		System.out.println("Total linkedlist execution time: " + totalTimeLL);
		System.out.println("Total arraylist execution time: "  + totalTimeAL); 
		
		
	}
	// getting something back from arrayListFaster
	//remove the 1st item much shorter on linkedList vs arrayList
	
	//linked list can't go directly to the element to remove it ;
	//arrayList will be faster to grab something in the middle of a list ; 
	// BUT if we try to REMOVE The first element from the list the linkedList will be Faster;;
	//b/c if we REMOVE the first element from the arrayList; then everything else has to be SHIFTER OVER ;
	// thereby CREATING a New arrayList ! 

}
