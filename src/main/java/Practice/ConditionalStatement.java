package Practice;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a= 10;
		int b = 20;
		ConditionalStatement at = new ConditionalStatement();
		at.ifelsesam();
		at.elseifsam();
		at.nestedifstat();
		at.Switchstat();
		if(a<b)
		{
			System.out.println("a is smaller than b");
		}

	}
	public void ifelsesam()
	{
		String name = "THILAK";
		String name1 = "Rock";
		if (name ==name1)
		{
			System.out.println("Both the name are same");
			
		}
		else
		{
			System.out.println("Both are different");
		}
	}
	public void elseifsam()
	{
		String name = "Thilak";
		String name1 = "Lee";
		if(name == "karthik")
		{
			System.out.println("Yes, I am thilak");
			
		}
		else if ( name == name1)
		{
			System.out.println("both are not same ");
		}
		else
		{
			System.out.println("not defined");
		}
	}
		public void nestedifstat()
		{
			Scanner tt = new Scanner(System.in);
			System.out.println("Enter your age ");
			int a =tt.nextInt();
			if(a>=0)
			{
				if(a>18)
				{
					System.out.println("The person is eligible for vote");
					
				}
				else
				{
					System.out.println("The person is not eligible for vote");
				}
				
			}
		}
		public void Switchstat()
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your id number");
			int number = scan.nextInt();
			switch(number)
			{
			case 2064745:
				System.out.println("Hi Thilak, You are approved");
				break;
			case 2064848:
				System.out.println("Hi Rock lee, you are approved");
				break;
			default: System.out.println("Access denied");
			
			
			}
			
		}

}
