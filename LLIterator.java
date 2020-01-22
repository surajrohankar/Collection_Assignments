//Write a Java program to iterate through all elements in a linked list.

package collection_assignments;

import java.util.LinkedList;

public class LLIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Blue");
		ll.add("Orange");
		for(String newList: ll) {
			System.out.println(newList);
		}


	}

}
