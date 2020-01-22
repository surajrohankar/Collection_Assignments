//Write a Java program to search an element in a array list.

package collection_assignments;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Black");
		al.add("White");
		al.add("Yellow");

		if (al.contains("Green")) {
			System.out.println("Element is available");
		} else
			System.out.println("Element is not available");
	}

}
