import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = scan.nextInt();
		switch (number)
		{
		case 1:
			System.out.println("Entered value is one");
			break;
		case 3:
			System.out.println("Entered value is three");
			break;
		case 7:
			System.out.println("Entered value is seven");
			break;
		default:
			System.out.println("Number not defined");
	
		}

	}

}
