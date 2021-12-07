package Day1;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int a[]= {1,5,6,2,8,7,910,50,60,80,70,100};
		
		int b[] =new int[12];
		
		System.out.println("Source Array :"+Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("New Array :"+Arrays.toString(b));

	}

}
