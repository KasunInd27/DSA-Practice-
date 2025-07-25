package singlyLinkedListRotate;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedListRotate singlyLinkedList = new SinglyLinkedListRotate();

	    singlyLinkedList.push(5);   // index 0
	    singlyLinkedList.push(10);  // index 1
	    singlyLinkedList.push(15);  // index 2
	    singlyLinkedList.push(20);  // index 3
	    singlyLinkedList.push(25);  // index 4

	    System.out.println("Original List:");
	    singlyLinkedList.printList();  // 5 -> 10 -> 15 -> 20 -> 25 -> null

	    System.out.println("\nRotate by 3:");
	    singlyLinkedList.rotate(3);
	    singlyLinkedList.printList();  // 20 -> 25 -> 5 -> 10 -> 15 -> null

	    // Verifying node values
	    System.out.println("Head: " + singlyLinkedList.head.value);                           // 20
	    System.out.println("Second: " + singlyLinkedList.head.next.value);                   // 25
	    System.out.println("Third: " + singlyLinkedList.head.next.next.value);               // 5
	    System.out.println("Fourth: " + singlyLinkedList.head.next.next.next.value);         // 10
	    System.out.println("Fifth: " + singlyLinkedList.head.next.next.next.next.value);     // 15
	    System.out.println("Tail: " + singlyLinkedList.tail.value);                          // 15
	  }
	}
