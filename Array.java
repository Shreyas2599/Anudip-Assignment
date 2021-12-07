//1.	Write a program in C# Sharp to store elements in an array and print it.
package Day1;

public class Array {
	
	public static void main(String [] args)
	{
		int a[]= {1, 1 ,2 ,3, 4,5 ,6 ,7 ,8 ,9};
		
		System.out.println("Elements of given array");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+ " ");
		}
	}
}
