/*Singly Linked List - Insert
Implement the following on the SinglyLinkedList class:

Insert

This function should insert a node at a specified index in a  SinglyLinkedList. It should return true if the index is valid, and false if the index is invalid (less than 0 or greater the length of the list).

Examples

(Note: you do not need to re-implement push, the test will be provided with it)

SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
singlyLinkedList.push(5);  // Success
singlyLinkedList.push(10);  // Success
singlyLinkedList.push(15);  // Success
singlyLinkedList.push(20);  // Success
 
singlyLinkedList.insert(12, 2);  // True
singlyLinkedList.insert(13, 100); // False
singlyLinkedList.size;         // 5
singlyLinkedList.head.value;      // 5
singlyLinkedList.head.next.value;   // 10
singlyLinkedList.head.next.next.value;  // 12*/

package singlyLinkedListInsert;

public class SinglyLinkedListInsert {
	public Node head; // First node of the list
	public Node tail; // Last node of the list
	public int size; // Total number of nodes

	// Initialize the list with the first node
	public Node insertSinglyLinkedList(int nodeValue) {
		head = new Node(); // Create a dummy node
		Node node = new Node(); // Actual first node
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	// Adds a node to the end of the list
	public void push(int nodeValue) {
		if (head == null) {
			insertSinglyLinkedList(nodeValue); // Create first node if list is empty
			return;
		} else {
			Node node = new Node();
			node.value = nodeValue;
			node.next = null;
			tail.next = node;
			tail = node; // Move tail to the newly added node
			size++;

		}
	}

	// Removes a node from the end of the list
	public Node pop() {
		if (head == null) {
			System.out.println("The SLL does not exist");
			return null;
		}

		Node removeNode;
		if (head == tail) { // Only one node exists
			removeNode = head;
			head = tail = null;
		} else {
			Node currentNode = head;
			while (currentNode.next != tail) {
				currentNode = currentNode.next;
			}
			removeNode = currentNode.next;
			currentNode.next = null;
			tail = currentNode;
		}

		size--;
		return removeNode;
	}

	// Returns the node at the given index
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

		if (index < 0 || index > size) { // Index is invalid
			return false;
		}

		if (head == null) { // Empty list
			head = newNode;
			tail = newNode;
		} else {
			if (index == 0) { // Insert at the head
				newNode.next = head;
				head = newNode;
			} else if (index == size) { // Insert at the tail
				tail.next = newNode;
				newNode.next = null;
				tail = newNode;
			} else { // Insert in the middle
				Node tempNode = head;
				int inx = 0;
				while (inx < index - 1) {
					tempNode = tempNode.next;
					inx += 1;
				}

				Node nextNode = tempNode.next;
				tempNode.next = newNode;
				newNode.next = nextNode;
			}
		}
		size++;
		return true;
	}

	// Print all node values
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}
