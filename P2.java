package Decfourthteen;

import java.util.ArrayList;
import java.util.HashSet;

public class P2 {

	public static void main(String[] args) {
		
		HashSet<String> h=new HashSet<>();
		
		h.add("Shreyas");
		h.add("Sahil");
		h.add("Bhavesh");
		h.add("Rose");
		
		ArrayList<String> s=new ArrayList<>(h);
		
		System.out.println("Elements are :"+s );
		
		

	}

}
