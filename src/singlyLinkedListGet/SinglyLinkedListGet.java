/*Singly Linked List - Get
Implement the following on the SinglyLinkedList class:

get

This function should find a node at a specified index in a  SinglyLinkedList. It should return the found node.

Examples

singlyLinkedList = SinglyLinkedList();
singlyLinkedList.push(5);  // Success
singlyLinkedList.push(10);  // Success
singlyLinkedList.push(15);  // Success
singlyLinkedList.push(20);  // Success
 
singlyLinkedList.get(0).value;    // 5
singlyLinkedList.get(1).value;    // 10
singlyLinkedList.get(2).value;   // 15
singlyLinkedList.get(3).value;    // 20
singlyLinkedList.get(4).value;    // Null*/

package singlyLinkedListGet;

public class SinglyLinkedListGet {
	public Node head;  // Points to the first node
	  public Node tail;  // Points to the last node
	  public int size;   // Tracks number of nodes

	  // Initializes the linked list with one node
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

	  // Adds a node at the end of the list
	  public void push(int nodeValue) {
	    if (head == null) {
	      insertSinglyLinkedList(nodeValue);
	    } else {
	      Node node = new Node();
	      node.value = nodeValue;
	      node.next = null;
	      tail.next = node;
	      tail = node;
	      size++;
	    }
	  }

	  // Removes and returns the last node
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
	      return null; // Index out of bounds
	    }
	    Node currentNode = head;
	    for (int i = 0; i < index; i++) {
	      currentNode = currentNode.next;
	    }
	    return currentNode; // Return the node at index
	  }

	  // Prints the full list for debugging
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