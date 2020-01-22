package collection_assignments;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Red");
		al1.add("Green");
		al1.add("Blue");
		ArrayList<String> al2 = (ArrayList<String>) al1.clone();
		System.out.println(al2);
	}

}
