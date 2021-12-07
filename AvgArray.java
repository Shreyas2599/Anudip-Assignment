package Day1;

public class AvgArray {

	public static void main(String[] args) {
		
		int a[] ={5,8,6,3,0,1,2,7,9};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/a.length;
		System.out.println("Average value of element is :"+avg);
		
	}

}
