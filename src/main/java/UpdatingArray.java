import java.util.Arrays;
import java.util.Scanner;

public class UpdatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] MobileNames = {"Vivo" , "Samsung" , "OPPO" , "REDMI"};
		System.out.println("Before updating"+Arrays.toString(MobileNames));
		Scanner scan = new Scanner(System.in);
		System.out.println("Which position need to be updated");
		int pos=scan.nextInt();
		System.out.println("Please update the new detail");
		String Update = scan.next();
		MobileNames[pos] = Update;
		System.out.println("UPDATED DETAIL");
		System.out.println(Arrays.toString(MobileNames));
		
		
		

	}

}
