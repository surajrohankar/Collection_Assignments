//Write a Java program to insert elements into the linked list at the first and last position.

package collection_assignments;

import java.util.LinkedList;

public class LLInsertFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Blue");
		ll.add("Orange");
		ll.add("Yellow");
		ll.add("White");
		System.out.println(ll);
		ll.add(0, "Pink");
		ll.add(7, "Golden");
		System.out.println(ll);

	}

}
