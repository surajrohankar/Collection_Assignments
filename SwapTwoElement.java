//Write a Java program of swap two elements in an array list.

package collection_assignments;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Black");
		al.add("White");
		al.add("Yellow");

		Collections.swap(al, 1, 5);
		System.out.println(al);

	}

}
