package Day2;

public class StringContentCheck {

	public static void main(String[] args) {
		
		String s1="Stephen Edwin King";
		String s2="Walter Winchell";
		String s3="Mike Royko";
		
		boolean e1=s1.equals(s2);
		boolean e2=s1.equals(s3);
		
		System.out.println("\"" + s1+ "\" equals \"" +s2+ "\"?"+e1);
		System.out.println("\"" + s1+ "\" equals \"" +s3+ "\"?"+e2);
	}

}
