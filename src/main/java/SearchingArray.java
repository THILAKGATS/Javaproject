import java.util.Scanner;

public class SearchingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		SearchingArray sea = new SearchingArray();
		sea.search(a);

	}
	public void search(int []a1)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Which number");
		int number = scan.nextInt();
		for(int pos = 0;pos<a1.length;pos++)
		{ 
			if(a1[pos]==number)
			{
				System.out.println(number+"The number is"+pos);
				
				
			}
		}
		System.out.println(number+"not found");
			
		
	}

}
