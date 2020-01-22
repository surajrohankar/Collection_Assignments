//Write a Java program to copy one array list into another.

package collection_assignments;

import java.util.*;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Blue");

		System.out.println(al);
		List<String> al2 = new ArrayList<String>();
		al2.addAll(al);
		System.out.println(al2);

	}

}
