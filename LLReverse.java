//Write a Java program to iterate a linked list in reverse order. 

package collection_assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class LLReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Blue");
		ll.add("Orange");
		ll.add("Yellow");
		ll.add("White");
		Iterator<String> itr=ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
