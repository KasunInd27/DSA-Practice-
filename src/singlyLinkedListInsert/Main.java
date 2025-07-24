package singlyLinkedListInsert;

public class Main {
	  public static void main(String[] args) {
	    SinglyLinkedListInsert singlyLinkedList = new SinglyLinkedListInsert();

	    singlyLinkedList.push(5);   // List: 5
	    singlyLinkedList.push(10);  // List: 5 -> 10
	    singlyLinkedList.push(15);  // List: 5 -> 10 -> 15
	    singlyLinkedList.push(20);  // List: 5 -> 10 -> 15 -> 20

	    singlyLinkedList.printList(); // Output: 5 -> 10 -> 15 -> 20 -> null

	    System.out.println("Insert 12 at index 2: " + singlyLinkedList.insert(12, 2));  // True
	    System.out.println("Insert 13 at index 100: " + singlyLinkedList.insert(13, 100)); // False

	    singlyLinkedList.printList(); // Output: 5 -> 10 -> 12 -> 15 -> 20 -> null

	    System.out.println("List Size: " + singlyLinkedList.size); // 5
	    System.out.println("Head Value: " + singlyLinkedList.head.value); // 5
	    System.out.println("2nd Node: " + singlyLinkedList.head.next.value); // 10
	    System.out.println("3rd Node: " + singlyLinkedList.head.next.next.value); // 12
	  }
	}
