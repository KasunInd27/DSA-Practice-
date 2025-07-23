package SinglyLinkedListPop;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedListPop sll = new SinglyLinkedListPop();
		
		sll.push(5);
        sll.push(10);

        System.out.println("Popped: " + sll.pop().value); // 10
        System.out.println("Tail: " + sll.tail.value);    // 5
        System.out.println("Size: " + sll.size);          // 1

        System.out.println("Popped: " + sll.pop().value); // 5
        System.out.println("Size: " + sll.size);          // 0

        System.out.println("Popped: " + sll.pop());       // null, prints "The SLL does not exist"
	}

}
