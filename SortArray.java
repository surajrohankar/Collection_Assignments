//Write a Java program to sort a given array list.

package collection_assignments;

import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(4);
		al.add(8);
		al.add(1);
		al.add(6);
		Collections.sort(al);
		System.out.println(al);
	}
}
