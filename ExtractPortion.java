//Write a Java program to extract a portion of a array list.

package collection_assignments;

import java.util.ArrayList;

public class ExtractPortion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Black");
		al.add("White");
		al.add("Yellow");
		System.out.println(al.subList(1, 5));

	}

}
