//Write a Java program to append the specified element to the end of a linked list.

package collection_assignments;

import java.util.LinkedList;

public class LLAppendArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red");
		ll.add("Green");
		ll.add("Blue");
		System.out.println(ll);
		ll.add("Orange");
		System.out.println(ll);

	}

}
