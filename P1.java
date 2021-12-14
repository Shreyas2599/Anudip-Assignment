package Decfourthteen;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int r=s.nextInt();
		
		//int r=5;
		double perimeter=2*Math.PI*r;
		System.out.println("Area of parameter is:"+perimeter);
		
		double circle_area=Math.PI*r*r;
		System.out.println("Area of cicle is:"+circle_area);
		
		s.close();

	}

}
