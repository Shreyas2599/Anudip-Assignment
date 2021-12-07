package Day1;

public class RemoveElement {

	public static void main(String[] args) {
		
		int a[]= {10,50,60,70,80,90,20};
		
		int delete_ele=90;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==delete_ele)
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
			}
		}
		System.out.println("Element deleted successfully");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
