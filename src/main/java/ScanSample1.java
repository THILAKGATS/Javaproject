import java.util.Scanner;

public class ScanSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*While using Scanner all other data types should be called as by their data types
		 * except string
		 */
		Scanner t = new Scanner(System.in);
		System.out.println("DATA");
		System.out.println("Enther your name ");
		String a = t.nextLine();
		System.out.println("DOB");
		String b = t.nextLine();//STRING SHOULD BE USED AS nextLine
		System.out.println("MOBILE NUMBER");
		long mn = t.nextLong();
		System.out.println("Enter School Name");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(mn);
		
	}

}
