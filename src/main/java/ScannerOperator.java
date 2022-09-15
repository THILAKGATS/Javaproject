import java.util.Scanner;
public class ScannerOperator {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Value");
		int t = a.nextInt();
		System.out.println("Enter the Value");
		int f = a.nextInt();
		System.out.println("Enther the next value");
		int s = a.nextInt();
		System.out.println(t+f+s);
		System.out.println(f-s);
		System.out.println(f/s);
		System.out.println(t%f);
		
		
		
	}

	

}
