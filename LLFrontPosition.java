//Write a Java program to insert the specified element at the front of a linked list.

package collection_assignments;

import java.util.LinkedList;

public class LLFrontPosition {

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
		ll.add(0, "Silver");
		System.out.println(ll);

	}

}
