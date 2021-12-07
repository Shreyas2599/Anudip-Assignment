package Day1;

public class ArrayIndex {

	public static void main(String[] args) {
		
		int a[]= {5,2,7,8,3,4,9};
		int element=2;
		int index=-1;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				index=i;
				break;
			}
		}
		System.out.println("Index of "+element+" is :" +index);

	}

}
