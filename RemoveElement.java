//Write a Java program to remove the third element from a array list.

package collection_assignments;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		  al.add("Red");
		  al.add("Green");
		  al.add("Blue");
		  al.add("Black");
		  al.add("White");
		  al.add("Yellow");
		  System.out.println(al);
		  al.remove(3);
		  System.out.println(al);

	}

}
