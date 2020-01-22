//Write a Java program to reverse elements in a array list

package collection_assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Black");
		al.add("White");
		al.add("Yellow");
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}
