package Day1;

public class Grid {

	public static void main(String[] args) {
		
		int [][]a= new int[10][10];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.printf("-",a[i][j]);
			}
			System.out.println();
		}

	}

}
