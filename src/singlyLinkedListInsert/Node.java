package singlyLinkedListInsert;

//Node class representing each element in the linked list
public class Node {
	int value;        // Stores the value of the node
	Node next;        // Reference to the next node in the list
	
	// Default constructor
	public Node() {}  
		
	// Constructor to initialize node with a value
	Node (int value) {
		this.value = value;
		this.next = null;
	}
	
}