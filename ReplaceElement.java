//Write a Java program to update specific array element by given element.

package collection_assignments;

import java.util.ArrayList;

public class ReplaceElement {

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
		  al.set(1, "Orange");
		  System.out.println(al);
		  
		

	}

}
