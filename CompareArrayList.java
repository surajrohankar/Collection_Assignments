//Write a Java program to compare two array lists.

package collection_assignments;

import java.util.ArrayList;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Red");
		al1.add("Green");
		al1.add("Blue");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Red");
		al2.add("Green");
		al2.add("Blue");
		System.out.println(al1.equals(al2));

	}

}
