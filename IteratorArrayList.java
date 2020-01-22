package collection_assignments;

import java.util.*;

public class IteratorArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Black");
		al.add("White");
		al.add("Yellow");

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
