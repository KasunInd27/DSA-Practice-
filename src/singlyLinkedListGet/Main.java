package singlyLinkedListGet;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedListGet singlyLinkedList = new SinglyLinkedListGet();

	    singlyLinkedList.push(5);   // index 0
	    singlyLinkedList.push(10);  // index 1
	    singlyLinkedList.push(15);  // index 2
	    singlyLinkedList.push(20);  // index 3

	    // Print the list
	    singlyLinkedList.printList();  // Output: 5 -> 10 -> 15 -> 20 -> null

	    // Test get(index)
	    System.out.println("Value at index 0: " + getValue(singlyLinkedList, 0)); // 5
	    System.out.println("Value at index 1: " + getValue(singlyLinkedList, 1)); // 10
	    System.out.println("Value at index 2: " + getValue(singlyLinkedList, 2)); // 15
	    System.out.println("Value at index 3: " + getValue(singlyLinkedList, 3)); // 20
	    System.out.println("Value at index 4: " + getValue(singlyLinkedList, 4)); // null
	  }

	  // Helper method to safely get value or null
	  private static String getValue(SinglyLinkedListGet list, int index) {
	    SinglyLinkedListGet.Node node = list.get(index);
	    return (node != null) ? String.valueOf(node.value) : "null";
	  }

}
