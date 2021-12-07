package Day1;

public class InsertElement {

	public static void main(String[] args) {
		
		int a[]= {10,50,60,80,70,90};
		
		int pos =3;
		int element =100;
		
		for(int i=a.length-1;i>=pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=element;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
