package Day1;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a[]= {5,6,7,9,8,3,1,80,40,33,41};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else if(min>a[i])
			{
				min=a[i];
			}
		} 
		System.out.println("Maximum no = "+ max + " Minimum no = "+min);
	}

}
