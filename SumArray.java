package Day1;

public class SumArray {

	public static void main(String[] args) {
		
		int a[]= {5,6,8,2,1,4};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of elements of array is :"+sum);

	}

}
