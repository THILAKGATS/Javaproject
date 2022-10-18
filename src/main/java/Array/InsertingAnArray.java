package Array;
import java.util.Arrays;
import java.util.Scanner;

public class InsertingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = new String[5];
		name [0] = "Thilak";
		name [2] ="Rock";
		name [4] = "Lee";
		InsertingAnArray obj = new InsertingAnArray();
		obj.inserting2();
				
		for(int i=0;i<name.length;i++)
		{
			if(name[i]!=null)
			{
				System.out.println(name[i]);
			}
		}

	}
	public void inserting2()
	{
		String name[] = new String[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<name.length;i++)
		{
			System.out.println("Enter the name");
			name [i] = scan.nextLine();
					
		}
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		
	}

}
