import java.util.Scanner;

public class LinearSearch {
	public int lsearch(int[] age1,int key)
	{
		for (int i=0;i<age1.length;i++)
		{
			if(age1[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
	 
		int [] age= {1,3,5,6,21,77,22,25,98};
		Scanner scan=new Scanner(System.in);
		LinearSearch search=new LinearSearch();
		System.out.println("Which number you want");
		int key=scan.nextInt();
		System.out.println(key+" your values is founded by"+search.lsearch(age,key));
	}

}
