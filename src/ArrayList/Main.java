package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> stringList = new ArrayList<String>();
		
		//Insertion
		stringList.add("A");
		stringList.add("C");
		stringList.add(1, "B");
		stringList.add("D");
		stringList.add("E");
		System.out.println(stringList);
		
		//Access
		System.out.println(stringList.get(2));
		System.out.println(stringList.get(3));
		System.out.println("--------------------");
		
		//Traversal by using for loop
		for(int i=0; i<stringList.size(); i++) {
			String letter = stringList.get(i);
			System.out.println(letter);
		}
		System.out.println("--------------------");
		
		//Traversal by using for-each loop
		for(String letter: stringList) {
			System.out.println(letter);
		}
		System.out.println("--------------------");
		
		//Iterator traversal
		Iterator<String> iterator = stringList.iterator();
		while(iterator.hasNext()) {
			String letter = iterator.next();
			System.out.println(letter);
			
		}
		System.out.println("--------------------");
		
		//Searching
		for(String letter: stringList) {
			if(letter.equals("D")) {
				System.out.println("The element is found");
				break;
			}
		}
		System.out.println("--------------------");
		
		//Searching by index of
		int index = stringList.indexOf("C");
		System.out.println("The element is found at index " + index);
		System.out.println("--------------------");
		
		//Remove
		stringList.remove(1);
		stringList.remove("D");
		System.out.println(stringList);
	}

}
