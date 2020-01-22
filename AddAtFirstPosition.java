package collection_assignments;

import java.util.ArrayList;

public class AddAtFirstPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		  al.add("Red");
		  al.add("Green");
		  al.add("Blue");
		  		  
		  for(String arrayList:al) {
			  System.out.println(arrayList);
			  
		  }
		  
		  al.add(0,"Yellow");
		  System.out.println(al);


	}

}
