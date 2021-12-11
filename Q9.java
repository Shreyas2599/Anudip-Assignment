package Day3;

import java.util.LinkedList;

public class Q9 {

	public static void main(String[] args) {
		  LinkedList <String> c1 = new LinkedList <String> ();
		  // use add() method to add values in the linked list
		  c1.add("Red");
		  c1.add("Green");
		  c1.add("Black");
		  System.out.println("Original linked list:" + c1);

		  LinkedList <String> new_l_list = new LinkedList <String> ();
		  new_l_list.add("White");
		  new_l_list.add("Pink");

		 
		  c1.addAll(1, new_l_list);
		  System.out.println("LinkedList:" + c1);

	}

}
