package Day1;

import java.util.Arrays;

public class ArrayStringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {5,6,3,1,4,8,9,7,0};
		String [] fruits= {"bannana","apple","jackfruit","grapes","orange","pineapple","guava"};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		Arrays.sort(fruits);
		
		System.out.println(Arrays.toString(fruits));
		//System.out.println(fruits);

	}

}
