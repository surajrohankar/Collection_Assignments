//Write a Java program to iterate through all elements in a linked list starting at the specified position.

package collection_assignments;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LLIterateSpcifiedPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Blue");
		ll.add("Orange");
		ll.add("Yellow");
		ll.add("White");
		Iterator itr=ll.listIterator(1);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
