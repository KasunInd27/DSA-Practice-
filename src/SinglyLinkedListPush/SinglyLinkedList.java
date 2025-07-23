/*Singly Linked List - Push
Implement the following on the SinglyLinkedList class:

push

This function should take in a value and add o node to the end of the SinglyLinkedList.

Examples

SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
singlyLinkedList.push(5)  // Success
singlyLinkedList.size   // 1
singlyLinkedList.head.value // 5
singlyLinkedList.tail.value // 5
 
singlyLinkedList.push(10)    // Success
singlyLinkedList.size      // 2
singlyLinkedList.head.value    // 5
singlyLinkedList.head.next.value  // 10
singlyLinkedList.tail.value    // 10*/

package SinglyLinkedListPush;

public class SinglyLinkedList {
	Node head;
	Node tail;
	int size;

	// Constructor initializes an empty list
	SinglyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// Push method to add a node to the end of the list
	public void push(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			// If list is empty, both head and tail point to the new node
			head = newNode;
			tail = newNode;
		} else {
			// Append to end and update tail
			tail.next = newNode;
			tail = newNode;
		}
		
		size++;  // Increment the size of the list
	}

}
