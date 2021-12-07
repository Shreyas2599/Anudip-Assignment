package Day1;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter elements into array :");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.print("Enter all elements :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Original array :");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Array in assending order :");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
		

	}

}
