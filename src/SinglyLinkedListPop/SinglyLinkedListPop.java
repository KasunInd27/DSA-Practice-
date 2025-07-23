/*Singly Linked List - Pop
Implement the following on the SinglyLinkedList class:

pop

This function should remove a node at the end of the SinglyLinkedList. It should return the node removed.

Examples

SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
singlyLinkedList.push(5);
singlyLinkedList.push(10);
 
singlyLinkedList.pop().value // 10
singlyLinkedList.tail.value  // 5
singlyLinkedList.size;   // 1
singlyLinkedList.pop().value; // 5
singlyLinkedList.size;   // 0
singlyLinkedList.pop()   // The SLL does not exist*/

package SinglyLinkedListPop;

public class SinglyLinkedListPop {
	public Node head;        // First node of the list
	public Node tail;        // Last node of the list
	public int size;         // Number of nodes in the list

	// Insert the first node when the list is empty
	public Node insertSinglyLinkedList(int nodeValue) {
		Node node = new Node();      // Create a new node
		node.value = nodeValue;      // Set the value
		node.next = null;            // Set the next to null since it's the only node
		head = node;                 // Head and tail both point to the new node
		tail = node;
		size = 1;                    // Initialize size to 1
		return head;
	}

	// Method to add a node to the end of the list
	public void push(int nodeValue) {
		// If the list is empty, create it
		if (head == null) {
			insertSinglyLinkedList(nodeValue);
			return;
		} else {
			// Otherwise, add the new node at the end
			Node node = new Node();
			node.value = nodeValue;
			node.next = null;
			tail.next = node;    // Link current tail to the new node
			tail = node;         // Update tail to new node
			size++;              
		}
	}
	
	// Method to remove and return the last node (pop operation)
	public Node pop() {
		// If the list is empty, display message and return null
		if(head == null) {
			System.out.println("The SLL does not exist");
			return null;
		}
		
		Node removeNode; // The node to be removed
		
		// If there's only one node
		if(head == tail) {
			removeNode = head;    // Store the only node
			head = tail = null;   // Set list to empty
		}else {
			// More than one node
			Node currentNode = head;
			// Traverse to the second-last node
			while (currentNode.next != tail) {
				currentNode = currentNode.next;
			}
			
			removeNode = currentNode.next;   // Node to remove is current tail
			currentNode.next = null;         // Remove reference to last node
			tail = currentNode;              // Update tail
		}
		
		size--;    // Decrease size after removal
		return removeNode;      // Return the removed node
	}
}
