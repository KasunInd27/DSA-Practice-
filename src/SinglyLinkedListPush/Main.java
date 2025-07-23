package SinglyLinkedListPush;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		
		singlyLinkedList.push(5);
        System.out.println("Size: " + singlyLinkedList.size); // 1
        System.out.println("Head: " + singlyLinkedList.head.value); // 5
        System.out.println("Tail: " + singlyLinkedList.tail.value); // 5

        singlyLinkedList.push(10);
        System.out.println("Size: " + singlyLinkedList.size); // 2
        System.out.println("Head: " + singlyLinkedList.head.value); // 5
        System.out.println("Head Next: " + singlyLinkedList.head.next.value); // 10
        System.out.println("Tail: " + singlyLinkedList.tail.value); // 10
	}

}
