/*Singly Linked List - Rotate
Implement the following on the SinglyLinkedList class:

Rotate

This function should rotate all the nodes in the list by some number passed in. For instance, if your list looks like 1 -> 2 -> 3 -> 4 -> 5 and you rotate by 2, the list should be modified to 3 -> 4 -> 5 -> 1 -> 2. The number passed in  to rotate can be any integer.

Time Complexity : O(N), where N is the length of the list.

Space Complexity : O(1)

Examples

(Note: you do not need to re-implement push, the test will be provided with it)

singlyLinkedList = SinglyLinkedList()
singlyLinkedList.push(5)  // Success
singlyLinkedList.push(10)  // Success
singlyLinkedList.push(15)  // Success
singlyLinkedList.push(20)  // Success
singlyLinkedList.push(25)  // Success
 
singlyLinkedList.rotate(3)
 
singlyLinkedList.head.value  // 20
singlyLinkedList.head.next.value   // 25
singlyLinkedList.head.next.next.value  // 5
singlyLinkedList.head.next.next.next.value // 10
singlyLinkedList.head.next.next.next.next.value // 15
singlyLinkedList.tail.value // 15*/

package singlyLinkedListRotate;

public class SinglyLinkedListRotate {
	public Node head;
	public Node tail;
	public int size;

	// Initializes the list with the first node
	public Node insertSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	// Adds a node to the end of the list
	public void push(int nodeValue) {
		if (head == null) {
			insertSinglyLinkedList(nodeValue);
			return;
		} else {
			Node node = new Node();
			node.value = nodeValue;
			node.next = null;
			tail.next = node;
			tail = node;
			size++;
		}
	}

	// Removes the last node
	public Node pop() {
		if (head == null) {
			System.out.println("The SLL does not exist");
			return null;
		}
		Node removeNode;
		if (head == tail) {
			removeNode = head;
			head = tail = null;
		} else {
			Node currentNode = head;
			while (currentNode.next != tail) {
				currentNode = currentNode.next;
			}
			removeNode = tail;
			currentNode.next = null;
			tail = currentNode;
		}
		size--;
		return removeNode;
	}

	// Returns the node at a given index
	public Node get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		Node currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		return currentNode;
	}

	// Inserts a node at a specific index
	public boolean insert(int data, int index) {
		Node newNode = new Node();
		newNode.value = data;
		if (index < 0 || index > size) {
			return false;
		}
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			if (index == 0) {
				newNode.next = head;
				head = newNode;
			} else if (index == size) {
				tail.next = newNode;
				newNode.next = null;
				tail = newNode;
			} else {
				Node tempNode = head;
				int inx = 0;
				while (inx < index - 1) {
					tempNode = tempNode.next;
					inx++;
				}
				Node nextNode = tempNode.next;
				tempNode.next = newNode;
				newNode.next = nextNode;
			}
		}
		size++;
		return true;
	}

	// Rotates the linked list to the left by 'number' positions
	public String rotate(int number) {
		if (size == 0 || number == 0) {
			return "No Rotation";
		}
		
		int index = number % size;
		if(index < 0) {
			index = size + index;   // Handle negative rotation
		}
		
		if (index == 0 || index >= size) {
			return "No Rotation";
		}
		
		// Find the node before the new head
		Node prevNode = head;
		for (int i = 0; i < index - 1; i++) {
			prevNode = prevNode.next;
		}
		
		// Reconnect nodes for rotation
		tail.next = head;            // Link tail to head to form a loop
		head = prevNode.next;        // New head
		tail = prevNode;             // New tail
		tail.next = null;            // Break the loop
		
		return "Success";
				
	}
	
	// Print all nodes in the list
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	// Node class
	class Node {
		int value;
		Node next;
	}
}
